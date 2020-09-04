package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = x/y;
            System.out.println(result);
        }catch (ArithmeticException | InputMismatchException e){
            if(e instanceof ArithmeticException){
                System.out.println(e);
            }
            if(e instanceof InputMismatchException) {
                System.out.println(e.getClass().getName());
            }
        }
    }
}
