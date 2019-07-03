package com.stackroute.pe1;
//a program for the following condition:
//Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
//repeat n number of times in the output String.
import java.util.Scanner;

public class RepeatLastAnyCharacter {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter a String");
        String s= ss.nextLine();
        System.out.println("Enter no. of chars to repeat from last");
        int n= ss.nextInt();
        //String m=s.substring(0,s.length()-n);
        System.out.println(repeatChar(s,n));
    }
     static String repeatChar(String s,int nChar)
    {
        String a=s.substring(s.length()-nChar);
        for(int i=0;i<nChar;i++)
        {
            s=s.concat(a);
        }
        return s;
    }
}
