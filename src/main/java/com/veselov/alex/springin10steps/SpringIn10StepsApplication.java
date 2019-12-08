package com.veselov.alex.springin10steps;

import com.veselov.alex.springin10steps.business.BinarySearchImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn10StepsApplication {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn10StepsApplication.class)){
            BinarySearchImp search = context.getBean(BinarySearchImp.class);
            BinarySearchImp search2 = context.getBean(BinarySearchImp.class);
            System.out.println(search);
            System.out.println(search2);
            search.binarySearch(new int[]{1, 10, 100}, 10);
        }
    }

}
