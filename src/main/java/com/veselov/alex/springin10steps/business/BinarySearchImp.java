package com.veselov.alex.springin10steps.business;

import com.veselov.alex.springin10steps.data.SortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BinarySearchImp {
    private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImp.class);

    @Qualifier("quickSort")
    @Autowired
    public SortAlgorithm algo;

    public int binarySearch(int[] ar, int search) {
        System.out.println(algo.getClass().getName());
        this.algo.sort(ar);
        return 3;
    }

//    @PostConstruct
//    public void postConstruct() {
//        LOGGER.info("postConstruct");
//    }
//
//    @PreDestroy
//    public void preDestroy() {
//        LOGGER.info("PreDestroy");
//    }
}
