package com.DSAproject.DSAproject.algorithm.searching;

import com.DSAproject.DSAproject.DTO.SearchResult;
import java.util.*;

public class LinearSearch {
    public static SearchResult search(int[] arr, int target) {
        List<int[]> steps = new ArrayList<>();
        int comparisons = 0, swaps = 0, foundIndex = -1;
        long start = System.currentTimeMillis();

        steps.add(Arrays.copyOf(arr, arr.length));

        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            int[] snapshot = Arrays.copyOf(arr, arr.length);
            snapshot[i] = -snapshot[i]; // highlight current
            steps.add(snapshot);

            if (arr[i] == target) {
                foundIndex = i;
                break;
            }
        }

        long end = System.currentTimeMillis();
        return new SearchResult(steps, end - start, comparisons, swaps, foundIndex);
    }
}

