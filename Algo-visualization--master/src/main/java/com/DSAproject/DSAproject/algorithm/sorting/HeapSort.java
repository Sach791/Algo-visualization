package com.DSAproject.DSAproject.algorithm.sorting;

import com.DSAproject.DSAproject.DTO.SortResult;
import java.util.*;

public class HeapSort {
    public static SortResult sort(int[] arr) {
        int n = arr.length;
        List<int[]> steps = new ArrayList<>();
        int[] comparisons = {0};
        int[] swaps = {0};
        long start = System.currentTimeMillis();

        steps.add(Arrays.copyOf(arr, n));

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i, steps, comparisons, swaps);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i, swaps);
            steps.add(Arrays.copyOf(arr, arr.length));
            heapify(arr, i, 0, steps, comparisons, swaps);
        }

        steps.add(Arrays.copyOf(arr, n));
        long end = System.currentTimeMillis();
        return new SortResult(steps, end - start, comparisons[0], swaps[0]);
    }

    private static void heapify(int[] arr, int n, int i, List<int[]> steps, int[] comparisons, int[] swaps) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;

        if (left < n) {
            comparisons[0]++;
            if (arr[left] > arr[largest]) largest = left;
        }
        if (right < n) {
            comparisons[0]++;
            if (arr[right] > arr[largest]) largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest, swaps);
            steps.add(Arrays.copyOf(arr, arr.length));
            heapify(arr, n, largest, steps, comparisons, swaps);
        }
    }

    private static void swap(int[] arr, int i, int j, int[] swaps) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        swaps[0]++;
    }
}
