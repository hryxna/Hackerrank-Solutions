package com.company;

import java.util.Scanner;

//5
//1 -2 4 -5 1
//9

public class arraySub {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int [] sub = new int[n];

        for(int i = 0; i < n; i++){
            sub[i] = sc.nextInt();
        }

        int result = prefixSum(n, sub);

        System.out.println(result);

    }

    private static int prefixSum(int s, int [] sub){

        int minVal = 0;
        int f= sub[0] < 0 ? 1 : 0;
        minVal += f;
        for(int i = 1; i < s; i++){

            sub[i] = sub[i - 1] + sub[i];
            if( sub[i] < 0){
                minVal++;
            }
            for(int j = 0; j < i; j++){
                int r = sub[i] - sub[j];
                if(r < 0){
                    minVal++;
                }
            }
        }


        return minVal;
    }
}
