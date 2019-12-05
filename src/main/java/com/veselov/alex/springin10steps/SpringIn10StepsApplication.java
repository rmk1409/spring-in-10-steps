package com.veselov.alex.springin10steps;

import com.veselov.alex.springin10steps.algorithm.BinarySerachImpl;
import com.veselov.alex.springin10steps.algorithm.BubbleSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIn10StepsApplication.class, args);

		BinarySerachImpl search = new BinarySerachImpl(new BubbleSortAlgorithm());
		int result = search.binarySearch(new int[]{12, 15, 18, 20}, 20);
		System.out.println(result);
	}

}
