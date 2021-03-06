package com.chc.SpringBootMybatis.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "redis.cache")
public class RedisProperties {

	private int expireSeconds;
	private String clusterNodes;
	private int commandTimeout;
	private int maxTotal;
	private int maxIdle;
	private int minIdle;
	private Boolean testBorrow;
	private Boolean testReturn;
	private long maxWaitMillis;
	
	public long getMaxWaitMillis() {
		return maxWaitMillis;
	}

	public void setMaxWaitMillis(long maxWaitMillis) {
		this.maxWaitMillis = maxWaitMillis;
	}

	public int getExpireSeconds() {
		return expireSeconds;
	}

	public void setExpireSeconds(int expireSeconds) {
		this.expireSeconds = expireSeconds;
	}

	public String getClusterNodes() {
		return clusterNodes;
	}

	public void setClusterNodes(String clusterNodes) {
		this.clusterNodes = clusterNodes;
	}

	public int getCommandTimeout() {
		return commandTimeout;
	}

	public void setCommandTimeout(int commandTimeout) {
		this.commandTimeout = commandTimeout;
	}

	public int getMaxTotal() {
		return maxTotal;
	}

	public void setMaxTotal(int maxTotal) {
		this.maxTotal = maxTotal;
	}

	public int getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}

	public int getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}

	public Boolean getTestBorrow() {
		return testBorrow;
	}

	public void setTestBorrow(Boolean testBorrow) {
		this.testBorrow = testBorrow;
	}

	public Boolean getTestReturn() {
		return testReturn;
	}

	public void setTestReturn(Boolean testReturn) {
		this.testReturn = testReturn;
	}
	

}