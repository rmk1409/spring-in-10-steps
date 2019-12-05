package com.veselov.alex.springin10steps;

import com.veselov.alex.springin10steps.data.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplicationScope {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsApplicationScope.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringIn10StepsApplicationScope.class, args);
        PersonDao dao = context.getBean(PersonDao.class);
        PersonDao dao2 = context.getBean(PersonDao.class);

        LOGGER.info("{}", dao);
        LOGGER.info("{}", dao.getConnection());
        LOGGER.info("{}", dao2);
        LOGGER.info("{}", dao2.getConnection());
    }

}
