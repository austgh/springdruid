package com.ahzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ahzx.dao")
public class SpringDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDruidApplication.class, args);
    }

}
