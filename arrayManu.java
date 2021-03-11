package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class arrayManu {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long max = 0;

        int len = queries.length;

        long [] arr = new long[n+1];

        for(int i = 0; i < len; i++){

            int a = queries[i][0]-1;
            int b = queries[i][1];
            int k = queries[i][2];

            arr[a] += k;
            arr[b] -= k;
        }

        for(int j = 1; j < arr.length; j++){
            arr[j] += arr[j-1];
            if(arr[j] > max){
                max = arr[j];
            }
        }

        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(String.valueOf(result));
        scanner.close();
    }
}
