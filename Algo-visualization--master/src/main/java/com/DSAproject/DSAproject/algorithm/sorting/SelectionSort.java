package com.DSAproject.DSAproject.algorithm.sorting;

import com.DSAproject.DSAproject.DTO.SortResult;
import java.util.*;

public class SelectionSort {
    public static SortResult sort(int[] arr) {
        int n = arr.length;
        List<int[]> steps = new ArrayList<>();
        int comparisons = 0, swaps = 0;
        long start = System.currentTimeMillis();

        steps.add(Arrays.copyOf(arr, n));

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
                swaps++;
                steps.add(Arrays.copyOf(arr, n));
            }
        }

        long end = System.currentTimeMillis();
        return new SortResult(steps, end - start, comparisons, swaps);
    }
}
