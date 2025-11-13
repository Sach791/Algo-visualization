package com.DSAproject.DSAproject.DTO;
import java.util.List;

public class SortResult {
    private List<int[]> steps;
    private long timeTaken;
    private int comparisons;
    private int swaps;

    public SortResult(List<int[]> steps, long timeTaken, int comparisons, int swaps) {
        this.steps = steps;
        this.timeTaken = timeTaken;
        this.comparisons = comparisons;
        this.swaps = swaps;
    }

    public List<int[]> getSteps() { return steps; }
    public long getTimeTaken() { return timeTaken; }
    public int getComparisons() { return comparisons; }
    public int getSwaps() { return swaps; }
}

