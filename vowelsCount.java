package com.company;

import java.lang.*;
import java.util.*;

public class vowelsCount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String[] v = new String[]{"a","e","i","o","u"};

        int count = 0;

        for(int i = 0; i < str.length(); i++){

            for (String s : v) {
                if (s.equalsIgnoreCase(String.valueOf(str.charAt(i)))) {
                    count++;
                }
            }

        }

        System.out.println(count);

    }
}
