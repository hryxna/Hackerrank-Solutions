package com.company;

import java.util.Scanner;

public class array1D {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int k =0;k<n;k++){
            a[k]= scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
