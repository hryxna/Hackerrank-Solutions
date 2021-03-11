package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class dpFibonacci {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> mem = new HashMap<>();
        int n = in.nextInt();
        System.out.println(dpFib(n,mem));

    }

    private static int dpFib(int n, HashMap<Integer, Integer> mem) {

        if(mem.containsKey(n)) return mem.get(n);

        if( n <= 2) return 1;

        mem.put(n,dpFib(n-1,mem)+ dpFib(n-2,mem));

        return mem.get(n);
    }
}
