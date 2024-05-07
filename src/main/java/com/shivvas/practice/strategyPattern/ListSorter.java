package com.shivvas.practice.strategyPattern;

import com.shivvas.practice.strategyPattern.sortingAlgo.ISortingAlgo;

import java.util.List;

/**
 * Client using strategy pattern to get sorting algo at runtime.
 */
public class ListSorter {

    ISortingAlgo sortingAlgo;

    public ListSorter(ISortingAlgo sortingAlgo) {
        this.sortingAlgo = sortingAlgo;
    }

    public void sortList(List<Integer> list) {
        sortingAlgo.sort(list);
    }

    public void setSortingAlgo(ISortingAlgo sortingAlgo) {
        this.sortingAlgo = sortingAlgo;
    }
}
