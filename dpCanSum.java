package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class dpCanSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int targetSum = in.nextInt();

        int [] arr = new int[] {5,3,4,7};

        HashMap<Integer,Boolean> sumMap = new HashMap<>();

        System.out.println(canSum(targetSum,arr,sumMap));

    }

    private static boolean canSum(int targetSum, int[] arr, HashMap<Integer, Boolean> sumMap) {

        if(sumMap.containsKey(targetSum)) return sumMap.get(targetSum);

        if(targetSum == 0) return true;

        if(targetSum < 0) return false;

        for(int i : arr){

            int rem = targetSum - i;

            if(canSum(rem, arr, sumMap)){
                sumMap.put(targetSum,true);
                return true;
            }

        }
        sumMap.put(targetSum,false);
        return false;
    }
}
