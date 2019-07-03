package com.stackroute.pe1;
//a program to reverse any string without using String Buffer.
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter a String");
        String s= ss.nextLine();
        System.out.println(reverse(s));

    }
     static String reverse(String input)
    {
        char[] c=input.toCharArray();
        char[] r=new char[input.length()];
        int len=input.length();
        for(int loop=0;loop<len;loop++)
        {
            r[loop]=c[len-1-loop];

        }
        return new String(r);
    }

}

