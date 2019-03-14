package com.wangcl.test;

//import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *  @SpringBootApplication，标注在某个类上，说明这个类是springboot的主配置类，
 *  springboot会运行这个类的main方法来启动springboot
 * */

@MapperScan("com.wangcl.test.*mapper")
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
