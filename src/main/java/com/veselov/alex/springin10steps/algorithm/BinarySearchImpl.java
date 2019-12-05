package com.veselov.alex.springin10steps.algorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    // Loosely coupling
    @Autowired
    @Qualifier("quickSortAlgorithm")
    private SortAlgorithm sort;

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
