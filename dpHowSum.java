package com.company;

import java.util.*;

public class dpHowSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int targetSum = in.nextInt();

        Integer [] arr = {5,3,4,7};

        HashMap<Integer,List<Integer>> sumMap = new HashMap<>();

        List<Integer> r = Arrays.asList(arr);

        System.out.println(howSum(targetSum,r,sumMap));

    }

    private static List<Integer> howSum(int targetSum, List<Integer> r, HashMap<Integer, List<Integer>> sumMap) {

        if(sumMap.containsKey(targetSum)) return sumMap.get(targetSum);

        if(targetSum == 0) return new ArrayList<>();

        if(targetSum < 0) return null;

        for(int j : r){

            int rem = targetSum - j;
            List<Integer> remResult = howSum(rem,r,sumMap);

            if(remResult != null){

                remResult.add(j);
                sumMap.put(targetSum,remResult);
                return sumMap.get(targetSum);

            }
        }

        sumMap.put(targetSum,null);
        return null;

    }
}
