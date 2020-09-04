package com.company;

import java.io.*;
import java.util.*;

//5 3 4
//3 2 1 1 1
//4 3 2
//1 1 4 1

//5

//5 2 3
//1 1 1 1 2
//3 7
//1 3 1

//0

public class eqStacks {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        int sum1 =0; int sum2 =0; int sum3=0;

        int l1 = h1.length;
        int l2 = h2.length;
        int l3 = h3.length;

        for(int i=l1-1;i>=0;i--){
            int temp1 = h1[i];
            sum1 += temp1;
            stack1.push(sum1);
        }
        for(int j=l2-1;j>=0;j--){
            int temp2 = h2[j];
            sum2 += temp2;
            stack2.push(sum2);
        }
        for(int k=l3-1;k>=0;k--){
            int temp3 = h3[k];
            sum3 += temp3;
            stack3.push(sum3);
        }

        while(true){
            if(stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty())
                return 0;
            int peek1 = stack1.peek();
            int peek2 = stack2.peek();
            int peek3 = stack3.peek();

            if(peek1==peek2 && peek1==peek3)
                return peek1;

            if(peek1>=peek2 && peek1>=peek3)
                stack1.pop();
            else if(peek2>=peek3 && peek2>=peek1 )
                stack2.pop();
            else if(peek3>=peek2 && peek3>=peek1)
                stack3.pop();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        System.out.println(String.valueOf(result));

    }
}

