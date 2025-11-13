package com.DSAproject.DSAproject.services;

import com.DSAproject.DSAproject.DTO.SortResult;
import com.DSAproject.DSAproject.algorithm.sorting.*;
import org.springframework.stereotype.Service;

@Service
public class SortingService {
    public SortResult sortArray(String algorithm, int[] arr) {
        switch (algorithm.toLowerCase()) {
            case "bubble": return BubbleSort.sort(arr);
            case "insertion": return InsertionSort.sort(arr);
            case "selection": return SelectionSort.sort(arr);
            case "merge": return MergeSort.sort(arr);
            case "quick": return QuickSort.sort(arr);
            case "heap": return HeapSort.sort(arr);
            default: throw new IllegalArgumentException("Unknown sorting algorithm: " + algorithm);
        }
    }
}

