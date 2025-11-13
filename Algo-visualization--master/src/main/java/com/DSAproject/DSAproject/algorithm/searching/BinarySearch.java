package com.DSAproject.DSAproject.algorithm.searching;

import com.DSAproject.DSAproject.DTO.SearchResult;
import java.util.*;

public class BinarySearch {
    public static SearchResult search(int[] arr, int target) {
        List<int[]> steps = new ArrayList<>();
        int comparisons = 0, swaps = 0, foundIndex = -1;
        long start = System.currentTimeMillis();

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            comparisons++;

            int[] snapshot = Arrays.copyOfRange(arr, low, high + 1);
            snapshot[mid - low] = -snapshot[mid - low];
            steps.add(snapshot);

            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long end = System.currentTimeMillis();
        return new SearchResult(steps, end - start, comparisons, swaps, foundIndex);
    }
}
