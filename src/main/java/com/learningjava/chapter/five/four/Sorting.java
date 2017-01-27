package com.learningjava.chapter.five.four;

import java.awt.*;

/**
 * Created by bobby on 1/23/2017.
 */
interface Sorting {
    List sort(List list);
}

class MergeSort implements Sorting {
    public List sort(List list) {
        //sort implementation
        return list;
    }
}

class QuickSort implements Sorting {
    public List sort(List list) {
        // sort implementation
        return list;
    }
}

class DynamicDataSet {
    Sorting sorting;

    public DynamicDataSet() {
        sorting = new MergeSort();
    }
    // DynamicdataSet implementation
}

class SnapshotDataSet {
    Sorting sorting;

    public SnapshotDataSet() {
        sorting = new QuickSort();
    }
}
