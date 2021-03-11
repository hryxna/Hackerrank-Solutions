package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestNumberOfIntegersForASum {

    List<Integer> result;
    int minSize;

    public List<Integer> solution(int[] input, int sum) {
        result = new ArrayList<>();
        minSize = 0;
        Arrays.sort(input);
        dfs(input, sum, 0, 0, new ArrayList<>());
        return result;
    }

    private void dfs(int[] input, int sum, int index, int currentSum, List<Integer> track) {
        if(currentSum == sum && track.size() <= minSize) {
            result.clear();
            result.addAll(track);
            minSize = track.size();
            return;
        }

        for (int i = index; i < input.length && currentSum < sum; i++) {
            currentSum += input[i];
            track.add(input[i]);
            minSize++;
            dfs(input, sum, i + 1, currentSum, track);
            track.remove(track.size() - 1);
            currentSum -= input[i];
            minSize--;
        }
    }

    public static void main(String[] args) {
        LowestNumberOfIntegersForASum lowestNumberOfIntegersForASum = new LowestNumberOfIntegersForASum();
        System.out.println(lowestNumberOfIntegersForASum.solution(new int[]{10, 0, -1, 20, 25, 30}, 45));
        System.out.println(lowestNumberOfIntegersForASum.solution(new int[]{10, 0, -1, 20, 25, 30}, 59));
        System.out.println(lowestNumberOfIntegersForASum.solution(new int[]{10, 0, -1, 20, 25, 30}, 60));
    }
}