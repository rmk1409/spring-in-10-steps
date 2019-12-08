package com.veselov.alex.springin10steps.algorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private SortAlgorithm sort;

    // Loosely coupling
    @Autowired
    public BinarySearchImpl(@Qualifier("quickSortAlgorithm") SortAlgorithm sort) {
        this.sort = sort;
    }

    /**
     * For now, it's just a dummy algorithm.
     * @param numbers
     * @param numberToSearchFor
     * @return
     */
    public int binarySearch(int[] numbers, int numberToSearchFor) {
        sort.sort(numbers);
        System.out.println(sort);
        return 3;
    }
}
