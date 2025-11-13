package com.DSAproject.DSAproject.algorithm.sorting;

import com.DSAproject.DSAproject.DTO.SortResult;
import java.util.*;

public class QuickSort {
    public static SortResult sort(int[] arr) {
        int n = arr.length;
        List<int[]> steps = new ArrayList<>();
        int[] comparisons = {0};
        int[] swaps = {0};
        long start = System.currentTimeMillis();

        steps.add(Arrays.copyOf(arr, n));
        quickSort(arr, 0, n - 1, steps, comparisons, swaps);
        steps.add(Arrays.copyOf(arr, n));

        long end = System.currentTimeMillis();
        return new SortResult(steps, end - start, comparisons[0], swaps[0]);
    }

    private static void quickSort(int[] arr, int low, int high, List<int[]> steps, int[] comparisons, int[] swaps) {
        if (low < high) {
            int p = partition(arr, low, high, comparisons, swaps);
            steps.add(Arrays.copyOf(arr, arr.length));
            quickSort(arr, low, p - 1, steps, comparisons, swaps);
            quickSort(arr, p + 1, high, steps, comparisons, swaps);
        }
    }

    private static int partition(int[] arr, int low, int high, int[] comparisons, int[] swaps) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            comparisons[0]++;
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j, swaps);
            }
        }
        swap(arr, i + 1, high, swaps);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j, int[] swaps) {
        if (i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        swaps[0]++;
    }
}
