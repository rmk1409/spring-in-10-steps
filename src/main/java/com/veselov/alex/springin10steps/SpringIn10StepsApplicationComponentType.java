package com.veselov.alex.springin10steps;

import com.veselov.alex.springin10steps.business.SomeBusinessClass;
import com.veselov.alex.springin10steps.component.AnotherComponent;
import com.veselov.alex.springin10steps.data.UserRepository;
import com.veselov.alex.springin10steps.web.SimpleController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn10StepsApplicationComponentType {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsApplicationComponentType.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn10StepsApplicationComponentType.class)) {
            LOGGER.info("Bean (Service) - {}", context.getBean(SomeBusinessClass.class));
            LOGGER.info("Bean (Just a component) - {}", context.getBean(AnotherComponent.class));
            LOGGER.info("Bean (Repository) - {}", context.getBean(UserRepository.class));
            LOGGER.info("Bean (Controller) - {}", context.getBean(SimpleController.class));
        }
    }

}
