package com.company;

import java.lang.*;
import java.util.*;
import java.util.regex.Pattern;

public class canComplete {

    public static void main(String []args){

        Scanner in = new Scanner(System.in);

        String []input = in.nextLine().split(" ");

        if(input[0].matches("\\D") || input[1].matches("\\D") || input[2].matches("\\D")){
            System.exit(1);
        }

        int tasks = 0, number = 0, days = 0;

        tasks = Integer.parseInt(input[0]);
        number = Integer.parseInt(input[1]);
        days = Integer.parseInt(input[2]);

        // t = 50, n = 2, d = 10
        // 5 mem -> 3 half + 2 full
        // i.e 50 / 5 = 10 task per member

        int taskPerMem = tasks / 5;

        int half =  taskPerMem / 2;

        // i.e total days required so 10 / 2 = 5 days
        int full = taskPerMem / 2;

        if(full <= days && (half * 2) <= days){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
