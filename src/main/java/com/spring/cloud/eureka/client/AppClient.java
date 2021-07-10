package com.spring.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class AppClient {

    public static void main(String[] args) {
        SpringApplication.run(AppClient.class,args);
    }

    @GetMapping("")
    public Object index(){
        System.out.println("这是服务端2");
        String str =  "这是服务端2返回的应答";
        return new String(str);
    }
}
