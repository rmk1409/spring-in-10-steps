package com.veselov.alex.springin10steps;

import com.veselov.alex.springin10steps.business.BinarySearchImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringIn10StepsApplication.class, args);
        BinarySearchImp search = context.getBean(BinarySearchImp.class);
        search.binarySearch(new int[]{1, 10, 100}, 10);
    }

}
