package com.DSAproject.DSAproject.controllers;

import com.DSAproject.DSAproject.DTO.SortResult;
import com.DSAproject.DSAproject.services.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
@RequestMapping("/sort")
public class SortingController {

    @Autowired
    private SortingService sortingService;

    @GetMapping
    public String showSortPage() {
        return "sorting";  // sorting.html
    }

    @PostMapping
    public String sortArray(@RequestParam String algorithm,
                            @RequestParam int size,
                            Model model) {
        int[] arr = generateRandomArray(size);
        SortResult result = sortingService.sortArray(algorithm, arr);

        model.addAttribute("algorithm", algorithm);
        model.addAttribute("result", result);
        return "result";  // result.html
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
