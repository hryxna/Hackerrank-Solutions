package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//5
//1 -2 4 -5 1

public class arraySub {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int neg_arr=0;

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int temp = 0;
        int temp1 =0;
        int temp2 =0;
        for(int i=0;i<n;i++){

            if(arr.get(i)<0) {neg_arr++;}

            temp = temp + arr.get(i);
            //System.out.println("In temp : "+temp);
            if(temp<0) {neg_arr++;}

            if(i <= (arr.size()/2) ){
                temp1 = arr.get(i)+ arr.get(i+1) + arr.get(i+2);
                //System.out.println("In temp1 : "+temp1);
                if(temp1<0) neg_arr++;
            }

            if(i+3<arr.size()){
                temp2 = temp1 +arr.get(i+3);
                //System.out.println("In temp2 : "+temp2);
                if(temp2<0) neg_arr++;
            }

        }
        if(temp<0) neg_arr++;
        //System.out.println(arr);
        System.out.println(neg_arr);

    }
}
