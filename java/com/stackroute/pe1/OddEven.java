package com.stackroute.pe1;
//a program which accepts an integer number as input from the user and perform the
//following conditional checks:
//a. Print Tom if number is odd and exists between 20 to 30
//b. Print Jerry, if number is even and exists between 20 and 30
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("enter the number\n");
        Scanner ss = new Scanner(System.in);
        int input = ss.nextInt();
        System.out.println(checkOdd(input));

    }
     static String checkOdd(int number)
    {
        if (number > 20 && number < 30) {
            if (number % 2 == 0)
                return "JERRY";
            else
                return "TOM";
        }
        else
            return "number should be in between 20 and 30";
    }
}