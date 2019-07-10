package com.jiayaxing.clouddemo.clouduserservice;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableSwagger2Doc
@EnableDiscoveryClient
@EnableApolloConfig
public class CloudUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudUserServiceApplication.class, args);
	}

}
