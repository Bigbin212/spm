package com.bigbincom.bigbin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.bigbincom.bigbin.dao")
public class SpmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpmApplication.class, args);
    }

}
