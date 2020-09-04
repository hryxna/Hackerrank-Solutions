package com.company;

//10
//1 97
//2
//1 20
//2
//1 26
//1 20
//2
//3
//1 91
//3

import java.util.*;

public class stackMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> maxStack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<n;i++){

            int c = sc.nextInt();

            switch (c){
                case 1 : int val = sc.nextInt();
                         stack.push(val);
                         if(maxStack.isEmpty() || val>=maxStack.peek()){
                             maxStack.push(val);
                         }
                         break;

                case 2 : int popped = stack.pop();
                         if(popped == maxStack.peek()){
                             maxStack.pop();
                         }
                         break;

                case 3 : System.out.println(maxStack.peek());
                         break;

                default: break;
            }
        }
        sc.close();
    }
}
