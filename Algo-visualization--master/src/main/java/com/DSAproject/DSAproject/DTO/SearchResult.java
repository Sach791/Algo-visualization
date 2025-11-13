package com.DSAproject.DSAproject.DTO;

import java.util.List;

public class SearchResult {
    private List<int[]> steps;
    private long timeTaken;
    private int comparisons;
    private int swaps;
    private int foundIndex;

    public SearchResult(List<int[]> steps, long timeTaken, int comparisons, int swaps, int foundIndex) {
        this.steps = steps;
        this.timeTaken = timeTaken;
        this.comparisons = comparisons;
        this.swaps = swaps;
        this.foundIndex = foundIndex;
    }

    public List<int[]> getSteps() { return steps; }
    public long getTimeTaken() { return timeTaken; }
    public int getComparisons() { return comparisons; }
    public int getSwaps() { return swaps; }
    public int getFoundIndex() { return foundIndex; }
}
