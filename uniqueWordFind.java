package com.company;

import java.lang.*;
import java.util.*;

public class uniqueWordFind {

    public static void main(String[] args){

        Scanner wscan = new Scanner(System.in);

        String [] words = wscan.nextLine().split("[ ,.]");

        HashMap<String,Integer> wordMap = new HashMap<>();

        int w = words.length;

        for(int i = 0; i < w; i++){

            int val = wordMap.putIfAbsent(words[i],1);
            if(val != 0){
                val += 1;
                //wordMap.putIfAbsent()
            }
        }

    }
}
