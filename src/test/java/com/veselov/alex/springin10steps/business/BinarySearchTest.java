package com.veselov.alex.springin10steps.business;

import com.veselov.alex.springin10steps.SpringIn10StepsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn10StepsApplication.class)
public class BinarySearchTest {
    @Autowired
    private BinarySearchImp search;

    @Test
    public void testBasicScenario(){
        assertThat(search.binarySearch(new int[]{}, 0), is(3));
    }
}
