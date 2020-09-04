package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;
//He is a very very good boy, isn't he?

// regex metacharacters
//x?	x occurs once or not at all
//X*	X occurs zero or more times
//X+	X occurs one or more times
//X{n}	X occurs exactly n times
//X{n,}	X occurs n or more times
//X{n,m}	X occurs at least n times but not more than m times

public class stringBuilder_Tokenizer {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String token = "[!,?._'@ ]+";
        // Write your code here.

        //using split()
        if(s.length()==0){
            System.out.println("0");
            return;
        }
        s=s.trim();
        String[] st = s.split(token);
        System.out.println(st.length);
        for (String value : st) {
            System.out.println(value);
        }

        //using StringTokenizer()
        StringTokenizer stz = new StringTokenizer(s.trim(),token);
        System.out.println(stz.countTokens());
        while(stz.hasMoreTokens()){
            System.out.println(stz.nextToken());
        }
        scan.close();

    }
}
