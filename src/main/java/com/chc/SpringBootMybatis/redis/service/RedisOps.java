package com.chc.SpringBootMybatis.redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.chc.SpringBootMybatis.redis.util.SerializeUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

@Service("RedisOps")
public class RedisOps {
	@Autowired
	private JedisCluster jedisCluster;

	public static void setJsonString(Jedis jedis, String key, Object object) {
		jedis.set(key, JSON.toJSONString(object));
	}

	public static Object getJsonObject(Jedis jedis, String key, Class clazz) {
		String value = jedis.get(key);
		return JSON.parseObject(value, clazz);
	}

	// 保存json序列化的数据
	public String setJsonString(String key, Object object) {
		return jedisCluster.set(key, JSON.toJSONString(object));
	}

	// 返还json序列化的数据的对象
	public Object getJsonObject(String key, Class clazz) {
		String value = jedisCluster.get(key);
		return JSON.parseObject(value, clazz);
	}

	// 根据Key来删除
	public Long delForKey(String key) {
		return jedisCluster.del(key);
	}
	/**
	 * 设置List集合
	 * 
	 * @param key
	 * @param list
	 */
	public void setList(String key, List<?> list) {
		try {

			if (!list.isEmpty()) {
				jedisCluster.set(key.getBytes(), SerializeUtil.serializeList(list));
			} else {// 如果list为空,则设置一个空
				jedisCluster.set(key.getBytes(), "".getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取List集合
	 * 
	 * @param key
	 * @return
	 */
	public List<?> getList(String key) {
		byte[] data = jedisCluster.get(key.getBytes());
		return SerializeUtil.unserializeList(data);
	}
}