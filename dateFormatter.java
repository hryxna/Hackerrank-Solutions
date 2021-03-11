package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormatter {

    public static void main(String[] args){

        String date = "07:05:45PM";

        DateFormat in = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat out = new SimpleDateFormat("HH:mm:ss");

        Date d = null;

        try {
            d = in.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(d != null){
            String nd = out.format(d);
            System.out.println(nd);
        }

    }

}
