package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        /*Display date in the following format:
        09/05/2021
        2021-09-05
        September 5, 2021
        Sunday, Sep 5, 2021 10:02 (display in GMT)
         */

//Create formatters to display date in various formats.
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter fmt6 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

//Create string variables to display today's date with desired format
        String formatDate = today.format(fmt);
        String formatDate2 = today.format(fmt2);
        String formatDate3 = today.format(fmt3);
        String formatDate4 = today.format(fmt4);
        String formatDate5 = today.format(fmt5);
        String formatDate6 = today.format(fmt6);

//Display the results
        System.out.println(formatDate);
        System.out.println(formatDate2);
        System.out.println(formatDate3);
        System.out.println(formatDate4);
        System.out.println(formatDate5 + " on " + formatDate6);


    }
}