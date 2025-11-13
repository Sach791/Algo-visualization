package com.DSAproject.DSAproject.controllers;

import com.DSAproject.DSAproject.DTO.SearchResult;
import com.DSAproject.DSAproject.services.SearchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
@RequestMapping("/search")
public class SearchingController {

    @Autowired
    private SearchingService searchingService;

    @GetMapping
    public String showSearchPage() {
        return "searching";  // searching.html
    }

    @PostMapping
    public String searchArray(@RequestParam String algorithm,
                              @RequestParam int size,
                              @RequestParam int target,
                              Model model) {
        int[] arr = generateRandomArray(size);
        if ("binary".equalsIgnoreCase(algorithm)) {
            java.util.Arrays.sort(arr);
        }

        SearchResult result = searchingService.searchArray(algorithm, arr, target);

        model.addAttribute("algorithm", algorithm);
        model.addAttribute("result", result);
        model.addAttribute("target", target);
        return "search-result";  // search-result.html
    }

    private int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
