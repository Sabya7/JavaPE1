package com.stackroute.pe1;
//a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
//       6 6 . . . nth iteration.
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
