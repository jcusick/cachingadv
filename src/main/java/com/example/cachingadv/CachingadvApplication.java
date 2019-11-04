package com.example.cachingadv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class CachingadvApplication {

    public static void main(String[] args) {
        SpringApplication.run(CachingadvApplication.class, args);
    }

}
