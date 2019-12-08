package com.veselov.alex.springin10steps;

import com.veselov.alex.springin10steps.business.ExternaleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn10StepsApplicationProperties {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn10StepsApplicationProperties.class)) {
            ExternaleService properties = context.getBean(ExternaleService.class);
            System.out.println(properties.getUrl());
        }
    }
}
