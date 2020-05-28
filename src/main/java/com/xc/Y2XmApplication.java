package com.xc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.xc.dao")
@SpringBootApplication
public class Y2XmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Y2XmApplication.class, args);
    }

}
