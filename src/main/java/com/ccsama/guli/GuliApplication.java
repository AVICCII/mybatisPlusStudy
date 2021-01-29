package com.ccsama.guli;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ccsama.guli.mapper")
public class GuliApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliApplication.class, args);
    }

}
