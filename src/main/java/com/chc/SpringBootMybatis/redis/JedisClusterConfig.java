package com.chc.SpringBootMybatis.redis;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisClusterConfig {

	@Autowired
	private RedisProperties redisProperties;

	/**
	 * 注意： 这里返回的JedisCluster是单例的，并且可以直接注入到其他类中去使用
	 * 
	 * @return
	 */
	@Bean
	public JedisCluster getJedisCluster() {
		String[] serverArray = redisProperties.getClusterNodes().split(",");// 获取服务器数组(这里要相信自己的输入，所以没有考虑空指针问题)
		Set<HostAndPort> nodes = new HashSet<>();

		for (String ipPort : serverArray) {
			String[] ipPortPair = ipPort.split(":");
			nodes.add(new HostAndPort(ipPortPair[0].trim(), Integer.valueOf(ipPortPair[1].trim())));
		}
		JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
		// 最大连接数
		jedisPoolConfig.setMaxTotal(redisProperties.getMaxTotal());
		// 在连接池中最大的idle状态（空闲的）jedis实例的个数
		jedisPoolConfig.setMaxIdle(redisProperties.getMaxIdle());
		// 在连接池中最小的idle状态（空闲的）jedis实例的个数
		jedisPoolConfig.setMinIdle(redisProperties.getMinIdle());
		// 在borrow一个jedis实例的时候，是否要进行验证操作，如果赋值为true,则得到的jedis实例肯定是可用的。
		jedisPoolConfig.setTestOnBorrow(redisProperties.getTestBorrow());
		// 在Return一个jedis实例的时候，是否要进行验证操作，如果赋值为true,则放回pool的jedis实例肯定是可用的。
		jedisPoolConfig.setTestOnReturn(redisProperties.getTestReturn());
		jedisPoolConfig.setMaxWaitMillis(redisProperties.getMaxWaitMillis());
		//return new JedisCluster(nodes, redisProperties.getCommandTimeout());
		return new JedisCluster(nodes, redisProperties.getCommandTimeout(),jedisPoolConfig);
	}

}
