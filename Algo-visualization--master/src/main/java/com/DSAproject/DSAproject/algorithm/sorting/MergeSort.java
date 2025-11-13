package com.DSAproject.DSAproject.algorithm.sorting;

import com.DSAproject.DSAproject.DTO.SortResult;
import java.util.*;

public class MergeSort {
    public static SortResult sort(int[] arr) {
        int n = arr.length;
        List<int[]> steps = new ArrayList<>();
        int[] comparisons = {0};
        int[] swaps = {0};

        long start = System.currentTimeMillis();

        steps.add(Arrays.copyOf(arr, n));
        mergeSort(arr, 0, n - 1, steps, comparisons, swaps);
        steps.add(Arrays.copyOf(arr, n));

        long end = System.currentTimeMillis();
        return new SortResult(steps, end - start, comparisons[0], swaps[0]);
    }

    private static void mergeSort(int[] arr, int low, int high, List<int[]> steps, int[] comparisons, int[] swaps) {
        if (low >= high) return;
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid, steps, comparisons, swaps);
        mergeSort(arr, mid + 1, high, steps, comparisons, swaps);
        merge(arr, low, mid, high, steps, comparisons, swaps);
        steps.add(Arrays.copyOf(arr, arr.length));
    }

    private static void merge(int[] arr, int low, int mid, int high, List<int[]> steps, int[] comparisons, int[] swaps) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            comparisons[0]++;
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= high) temp[k++] = arr[j++];

        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = temp[k];
            swaps[0]++;
        }
    }
}
