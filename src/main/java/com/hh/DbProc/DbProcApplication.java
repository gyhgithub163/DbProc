package com.hh.DbProc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//@SpringBootApplication是@Configuration + @EnableAutoConfiguration + @ComponentScan的复合注解
@SpringBootApplication
//扫描持久层接口
@MapperScan("com.hh.DbProc.dao")
//注册swagger
@EnableSwagger2
public class DbProcApplication {
    //web程序入口
    public static void main(String[] args) {
        SpringApplication.run(DbProcApplication.class, args);
    }

}
