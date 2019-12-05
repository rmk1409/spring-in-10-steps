package com.veselov.alex.springin10steps.algorithm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
