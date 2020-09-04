package com.company;

import java.util.Scanner;

public class str_int {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int temp = Integer.parseInt(S);
            System.out.println(temp);
        }catch (Exception e){
            System.out.println("Bad String");
        }
    }
}
