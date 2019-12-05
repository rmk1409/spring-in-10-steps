package com.veselov.alex.springin10steps.algorithm;

public class BinarySerachImpl {


    /**
     * For now, it's just a dummy algorithm.
     * @param numbers
     * @param numberToSearchFor
     * @return
     */
    public int binarySearch(int[] numbers, int numberToSearchFor) {
        // Tight coupling
        BubbleSortAlgorithm sort = new BubbleSortAlgorithm();
        sort.sort(numbers);
        return 3;
    }
}
