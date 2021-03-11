package com.company;

import java.util.Scanner;

public class AbbreviationDP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);

            System.out.println(result);
        }
    }

    private static String abbreviation(String a, String b) {

        boolean[][] isValid = new boolean[a.length()+1][b.length()+1];
        isValid[0][0] = true;
        for (int i= 1; i <= a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i - 1))) {
                isValid[i][0] = false;
            }
            else isValid[i][0] = true;
        }
        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (a.charAt(i-1) == b.charAt(j-1)) {
                    isValid[i][j] = isValid[i-1][j-1];
                }else if (Character.toUpperCase(a.charAt(i-1))  ==    b.charAt(j-1)) {
                    isValid[i][j] = isValid[i-1][j-1] || isValid[i-1][j];
                }else if (Character.isUpperCase(a.charAt(i-1))) {
                    isValid[i][j] = false;
                }else {
                    isValid[i][j] = isValid[i-1][j];
                }
            }
        }
        return isValid[a.length()][b.length()]? "YES" : "NO";

    }
}
