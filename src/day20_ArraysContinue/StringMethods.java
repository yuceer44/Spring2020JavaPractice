package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Muhtar ";
           char[] characters =  name.toCharArray();

        System.out.println( Arrays.toString(characters) );

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[] ch1 = str1.toCharArray(); //[C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        char[] ch2 = str2.toCharArray(); //[S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

        Arrays.sort(ch1); // [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]
        Arrays.sort(ch2); // [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]

        boolean euqalStr = Arrays.equals(ch1, ch2);

        System.out.println(euqalStr); // str1 & str2 are biuld out of same characters




    }

}
