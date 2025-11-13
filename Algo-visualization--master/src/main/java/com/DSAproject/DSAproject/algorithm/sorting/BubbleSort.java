package com.DSAproject.DSAproject.algorithm.sorting;
import com.DSAproject.DSAproject.DTO.SortResult;
import java.util.*;

public class BubbleSort {
    public static SortResult sort(int[] arr) {
        int n = arr.length;
        List<int[]> steps = new ArrayList<>();
        int comparisons = 0, swaps = 0;
        long start = System.currentTimeMillis();

        steps.add(Arrays.copyOf(arr, n));

        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    steps.add(Arrays.copyOf(arr, n));
                    flag = true;
                }
            }
            if(!flag) break;
        }

        long end = System.currentTimeMillis();
        return new SortResult(steps, end - start, comparisons, swaps);
    }
}

