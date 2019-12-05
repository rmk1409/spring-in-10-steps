package com.veselov.alex.springin10steps;

import com.veselov.alex.outofscan.ImportantThing;
import com.veselov.alex.springin10steps.business.BinarySearchImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.veselov.alex.outofscan","com.veselov.alex.springin10steps"})
public class SpringIn10StepsApplicationComponentScan {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsApplicationComponentScan.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringIn10StepsApplicationComponentScan.class, args);
        ImportantThing bean = context.getBean(ImportantThing.class);
        BinarySearchImp search = context.getBean(BinarySearchImp.class);
        LOGGER.info("{}", bean);
        LOGGER.info("{}", search);
    }

}
