package main.java.com.shivvas.practice.strategyPattern.sortingAlgo;

import org.springframework.stereotype.Service;

import java.util.List;


/**
 * First Strategy (merge sorting)
 */
public class MergeSort implements ISortingAlgo {
    @Override
    public void sort(List<Integer> list) {
        System.out.println("Applying mergeSort algo...");
    }
}
