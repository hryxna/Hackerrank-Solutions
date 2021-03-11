package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class dpGrid {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> memo = new HashMap<>();
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(grid(m,n,memo));

    }

    private static int grid(int m, int n, HashMap<String, Integer> memo) {

        String k = m+","+n;

        if(memo.containsKey(k)) return memo.get(k);

        if(m == 1 && n == 1) return 1;

        if(m == 0 || n == 0) return 0;

        memo.put(k,grid(m - 1,n, memo) + grid(m, n - 1, memo));

        return memo.get(k);

    }
}
