package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
//8
//Julia
//Samantha
//Samantha_21
//1Samantha
//Samantha?10_2A
//JuliaZ007
//Julia@007
//_Julia007

//Invalid
//Valid
//Valid
//Invalid
//Invalid
//Valid
//Invalid
//Invalid

class UsernameValidator {
    /*
     * Write regular expression here.
     */

    public static final String regularExpression = Pattern.compile("^[a-zA-Z]\\w{7,29}$").toString();



}
public class userRegex {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
