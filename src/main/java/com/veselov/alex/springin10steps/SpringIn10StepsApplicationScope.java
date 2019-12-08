package com.veselov.alex.springin10steps;

import com.veselov.alex.springin10steps.data.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn10StepsApplicationScope {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsApplicationScope.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn10StepsApplicationScope.class);
        PersonDao dao = context.getBean(PersonDao.class);
        PersonDao dao2 = context.getBean(PersonDao.class);

        LOGGER.info("{}", dao);
        LOGGER.info("{}", dao.getConnection());
        LOGGER.info("{}", dao2);
        LOGGER.info("{}", dao2.getConnection());
    }

}
