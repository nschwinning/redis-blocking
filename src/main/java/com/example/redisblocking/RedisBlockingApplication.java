package com.example.redisblocking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RedisBlockingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisBlockingApplication.class, args);
    }

}
