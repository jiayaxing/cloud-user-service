package com.jiayaxing.clouddemo.clouduserservice.bean;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@EnableApolloConfig
@Component
public class ApolloConfig {
    @Value("${hello:apollo}")
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
