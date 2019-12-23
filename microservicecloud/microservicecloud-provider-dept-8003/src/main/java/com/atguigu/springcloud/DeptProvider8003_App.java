package com.atguigu.springcloud;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

 
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class DeptProvider8003_App
{
  private static final Logger logger = LoggerFactory.getLogger(DeptProvider8003_App.class);
  public static void main(String[] args)
  {
   SpringApplication.run(DeptProvider8003_App.class, args);
   if (logger.isInfoEnabled()){
       logger.info("application start");
   }
  }
}
 

