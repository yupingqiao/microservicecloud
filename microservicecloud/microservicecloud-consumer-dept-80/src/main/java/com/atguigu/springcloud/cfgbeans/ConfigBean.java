package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 相当于application.xml 容器生产bean
 * */
@Configuration
public class ConfigBean {
	/**
	 * RestTemplate提供了多种便捷访问远程Http服务的方法， 
	         是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
	 * */
	@Bean
	@LoadBalanced    //加负载均衡机制
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
//	@Bean
//	public IRule myRule(){
//		return new RandomRule(); //重新选择随机算法的负载均衡 替代默认的轮询算法RoundRobinRule
//		//RetryRule先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
//	}
}
