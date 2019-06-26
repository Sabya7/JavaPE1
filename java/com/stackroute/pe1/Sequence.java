package com.stackroute.pe1;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner ss=new Scanner(System.in);
        int input=ss.nextInt();
        System.out.println(printSequence(input));

    }
     static String printSequence(int input)
    { String result="";
        for(int i=1;i<=input;i++)
        {
            for(int j=1;j<=i;j++)
            {
                result+=i;
            }
        } return result;
    }
}
