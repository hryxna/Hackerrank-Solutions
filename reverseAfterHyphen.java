package com.company;

public class reverseAfterHyphen {

    public static void main(String[] args) {
        String s = "abcd-defg-ghij-";

        int l = s.length();
        int index = 0;
        for(int i = 0; i < l; i++){
            String c = String.valueOf(s.charAt(i));
            if(c.equals("-")){
                index = i;
                printrev(i,s);
            }

        }

    }

    private static void printrev(int k, String s) {

    }
}
