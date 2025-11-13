package com.DSAproject.DSAproject.services;

import com.DSAproject.DSAproject.DTO.SearchResult;
import com.DSAproject.DSAproject.algorithm.searching.BinarySearch;
import com.DSAproject.DSAproject.algorithm.searching.LinearSearch;
import org.springframework.stereotype.Service;

@Service
public class SearchingService {
    public SearchResult searchArray(String algorithm, int[] arr, int target) {
        switch (algorithm.toLowerCase()) {
            case "linear": return LinearSearch.search(arr, target);
            case "binary": return BinarySearch.search(arr, target);
            default: throw new IllegalArgumentException("Unknown search algorithm: " + algorithm);
        }
    }
}
