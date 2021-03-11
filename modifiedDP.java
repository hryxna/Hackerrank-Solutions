package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class modifiedDP {

    // Complete the fibonacciModified function below.
    static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n) {
        BigInteger t3 = BigInteger.valueOf(0);
        while(n-- > 2){

            t3 = t1.add(t2.pow(2));
            t1 = t2;
            t2 = t3;

        }

        return t3;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] t1T2n = scanner.nextLine().split(" ");

        BigInteger t1 = BigInteger.valueOf(Integer.parseInt(t1T2n[0]));

        BigInteger t2 = BigInteger.valueOf(Integer.parseInt(t1T2n[1]));

        int n = Integer.parseInt(t1T2n[2]);

        BigInteger result = fibonacciModified(t1, t2, n);

        System.out.println(result);

        scanner.close();
    }
}

