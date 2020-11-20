package com.vardhan.spring.springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringdemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	String greetingtest(){
		Assert.assertEquals(Hello.greetings(),"Greetings from Spring Boot!")
	}

}
