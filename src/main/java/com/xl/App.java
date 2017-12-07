package com.xl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/provider.xml");
		context.start();
		   System.out.println("服务启动成功!");  
		    System.in.read();
		}
}
