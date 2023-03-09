package com.example.alongWith;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/umcenterbacked/mapper")
public class AlongWithApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlongWithApplication.class, args);
    }

}
