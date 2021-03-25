package com.jt.mybatispulsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.jt.mybatispulsdemo.dao")
public class MybatisPulsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPulsDemoApplication.class, args);
    }

}
