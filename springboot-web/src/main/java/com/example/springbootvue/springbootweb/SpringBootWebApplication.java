package com.example.springbootvue.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @program: springboot-vue
 * @descripttion: springboot app
 * @author: jiuson
 * @create: 2019-03-27 17:40:57
 */

@SpringBootApplication
@ServletComponentScan
public class SpringBootWebApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
