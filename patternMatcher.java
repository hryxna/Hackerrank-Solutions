package com.company;

import java.util.Scanner;
import java.util.regex.*;
//3
//([A-Z])(.+)
//[AZ[a-z](a-z)
//batcatpat(nat

public class patternMatcher
{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern); // will only compile properly if brackets are properly closed
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}