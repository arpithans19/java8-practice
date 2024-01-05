package com.hackerrank;

import javafx.fxml.LoadException;

import java.io.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;


//class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

//    public static String findDay(int month, int day, int year) {
//        int d = Integer.valueOf(day);
//        int m=Integer.valueOf(month);
//        int y=Integer.valueOf(year);
//        LocalDate ld=LocalDate.of(y,m,d);
//        return ld.getDayOfWeek().toString();
//
//
//    }
//
//}
//
//public class DateandTime {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}




//--------------------------------------------------------------------------------------//

/* 2nd Approach - to Find day of year*/

//    public class Solution {
//
//        public static void main(String[] args) {
//            try (Scanner scanner = new Scanner(System.in)) {
//                int month = scanner.nextInt();
//                int day = scanner.nextInt();
//                int year = scanner.nextInt();
//
//                Calendar calendar = Calendar.getInstance();
//                calendar.set(Calendar.DATE, day);
//                calendar.set(Calendar.MONTH, month - 1);
//                calendar.set(Calendar.YEAR, year);
//
//                System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK,
//                        Calendar.LONG, new Locale("en", "US")).toUpperCase());
//            }
//        }
//    }



//--------------------------------------------------------------------------------------//

/* 3rd Approach - to Find day of year*/

