package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class OverYingxueDuduApplication {

    public static void main(String[] args) {
        SpringApplication.run(OverYingxueDuduApplication.class, args);
    }

}
