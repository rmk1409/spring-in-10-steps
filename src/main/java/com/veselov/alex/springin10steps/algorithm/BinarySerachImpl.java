package com.veselov.alex.springin10steps.algorithm;

public class BinarySerachImpl {

    // Loosely coupling
    private SortAlgorithm sort;

    public BinarySerachImpl(SortAlgorithm sort) {
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
