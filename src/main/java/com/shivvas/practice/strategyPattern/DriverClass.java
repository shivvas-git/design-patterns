package com.shivvas.practice.strategyPattern;

import com.shivvas.practice.strategyPattern.sortingAlgo.ISortingAlgo;
import com.shivvas.practice.strategyPattern.sortingAlgo.MergeSort;
import com.shivvas.practice.strategyPattern.sortingAlgo.QuickSort;

import java.util.Arrays;

/**
 * Simple java app demonstrating strategy pattern
 */
public class DriverClass {

    public static void main(String[] args) {

        ISortingAlgo algo = new MergeSort();
        ListSorter listSorter = new ListSorter(algo);
        listSorter.sortList(Arrays.asList(1, 2, 4));

        algo = new QuickSort();
        listSorter.setSortingAlgo(algo);
        listSorter.sortList(Arrays.asList(1, 2, 4, 3));
    }
}
