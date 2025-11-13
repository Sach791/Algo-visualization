package com.DSAproject.DSAproject.algorithm.sorting;

import com.DSAproject.DSAproject.DTO.SortResult;
import java.util.*;

public class InsertionSort {
    public static SortResult sort(int[] arr) {
        int n = arr.length;
        List<int[]> steps = new ArrayList<>();
        int comparisons = 0, swaps = 0;
        long start = System.currentTimeMillis();

        steps.add(Arrays.copyOf(arr, n));

        for (int i = 1; i < n; i++) {
            int cur = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > cur) {
                comparisons++;
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = cur;
            swaps++;
            steps.add(Arrays.copyOf(arr, n));
        }

        long end = System.currentTimeMillis();
        return new SortResult(steps, end - start, comparisons, swaps);
    }
}
