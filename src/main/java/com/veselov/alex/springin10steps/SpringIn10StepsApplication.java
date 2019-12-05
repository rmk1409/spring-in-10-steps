package com.veselov.alex.springin10steps;

import com.veselov.alex.springin10steps.algorithm.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl search = applicationContext.getBean(BinarySearchImpl.class);

		int result = search.binarySearch(new int[]{12, 15, 18, 20}, 20);
		System.out.println(result);
	}

}
