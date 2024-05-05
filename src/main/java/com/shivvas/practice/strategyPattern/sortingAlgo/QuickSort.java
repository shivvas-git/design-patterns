package main.java.com.shivvas.practice.strategyPattern.sortingAlgo;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Second Strategy (merge sorting)
 */
public class QuickSort implements ISortingAlgo {

    @Override
    public void sort(List<Integer> list) {
        System.out.println("Applying quickSort algo...");
    }
}
