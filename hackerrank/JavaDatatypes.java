package com.hackerrank;


import java.util.Scanner;

public class JavaDatatypes {

        static String whoCanFitTheNumber(String numString)
        {
            String str = "";
            try{
                long num = Long.parseLong(numString);
                str = numString + " can be fitted in:\n";
                if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
                    str = str.concat("* byte\n* short\n* int\n* long");
                }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
                    str = str.concat("* short\n* int\n* long");
                }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
                    str = str.concat("* int\n* long");
                }else{
                    str = str.concat("* long");
                }
            }catch (NumberFormatException e){
                str = numString+" can't be fitted anywhere.";
            }
            return str;
        }
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int numTestCases = scanner.nextInt() ;
            scanner.nextLine();
            for(int i=0; i<numTestCases;i++){
                String numString = scanner.nextLine();
                System.out.println(whoCanFitTheNumber(numString));
            }
        }
    }

