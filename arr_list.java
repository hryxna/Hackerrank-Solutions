package com.company;

import java.util.ArrayList;
import java.util.*;
//5
//5 41 77 74 22 44
//1 12
//4 37 34 36 52
//0
//3 20 22 33
//5
//1 3
//3 4
//3 1
//4 3
//5 5

//74
//52
//37
//ERROR!
//ERROR!

public class arr_list {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> row = new ArrayList<>(n);

        for(int i = 0; i<n;i++){
            int d = sc.nextInt();
            ArrayList<Integer> col = new ArrayList<>(d);
            for(int j=0;j<d;j++){
                int z = sc.nextInt();
                col.add(z);
            }
            row.add(col);
        }

        int q = sc.nextInt();
        for(int k =0;k<q;k++){
            try{
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(row.get(x-1).get(y-1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }

}

