package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int [] elements){

        this.elements = elements;
    }

    int computeDifference(){
        maximumDifference =0;
        for(int i=0;i<elements.length-1;i++){
            for(int j=i;j<elements.length-1;j++){
                int diff = Math.abs(elements[i] - elements[j+1]) ;
                if(diff>maximumDifference){
                    maximumDifference = diff;
                }
            }
        }
        return maximumDifference;
    }
    // Add your code here
} // End of Difference class

public class maxDiff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}