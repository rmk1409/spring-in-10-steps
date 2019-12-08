package com.veselov.alex.springin10steps;

import com.veselov.alex.outofscan.ImportantThing;
import com.veselov.alex.springin10steps.business.BinarySearchImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.veselov.alex.outofscan", "com.veselov.alex.springin10steps"})
public class SpringIn10StepsApplicationComponentScan {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsApplicationComponentScan.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn10StepsApplicationComponentScan.class);
        ImportantThing bean = context.getBean(ImportantThing.class);
        BinarySearchImp search = context.getBean(BinarySearchImp.class);
        LOGGER.info("{}", bean);
        LOGGER.info("{}", search);
    }

}
