package com.company;

import java.io.*;
import java.util.*;
//5
//john tom
//john mary
//john tom
//mary anna
//mary anna

//1
//2
//2
//3
//3

public class hashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
        HashSet<String> hs = new HashSet<>();

        for(int i = 0;i<t;i++){
            hs.add("("+pair_left[i]+","+pair_right[i]+")");
            System.out.println(hs.size());
        }

        System.out.println(hs);

    }
}
