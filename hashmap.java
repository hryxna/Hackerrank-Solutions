package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine().trim();
            int phone = in.nextInt();
            hashMap.put(name, phone);
            in.nextLine();

        }

        while (in.hasNext()) {
            String s = in.nextLine().trim();

            if(!hashMap.containsKey(s)) System.out.println("Not found");
            else {
                System.out.println(s+"="+hashMap.get(s));
            }
        }

    }
}
