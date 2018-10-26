package com.wlt.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



//@MapperScan("com.wlt.mall.mapper")
@MapperScan(basePackages = "com.wlt.mall.dao")


//@EnableAutoConfiguration
@SpringBootApplication
//@EnableAspectJAutoProxy
@ComponentScan(value = {"com.wlt.mall"})

public class Application {
	public static void main(String[] args) {

		System.out.println(11111);
		SpringApplication.run(Application.class, args);
	}



}




