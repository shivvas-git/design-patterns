package main.java.com.shivvas.practice.strategyPattern;

import main.java.com.shivvas.practice.strategyPattern.sortingAlgo.ISortingAlgo;
import main.java.com.shivvas.practice.strategyPattern.sortingAlgo.MergeSort;
import main.java.com.shivvas.practice.strategyPattern.sortingAlgo.QuickSort;

import java.util.Arrays;

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
