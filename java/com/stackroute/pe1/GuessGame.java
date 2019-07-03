package com.stackroute.pe1;
//a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
//100) User should guess until the the target number is guessed correctly.
//Print separate messages for the following:
//a. Number guessed is more than original number
//b. Number guessed is less than original number
//c. Number guessed matches the original number
import java.util.Scanner;

public class GuessGame {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number 1-50");
        int n=scanner.nextInt();
        System.out.println(guess(n));
    }
      static String guess(int n)
        {int g;Scanner scanner=new Scanner(System.in); String result;
        while(true) {
            System.out.println("guess");
            g = scanner.nextInt();
            if (g == n)
            {    result= "you guessed correctly";
                break;
            }
            else if (g>n)
                result= "is greater than the number. guess again";
            else
                result="is less than the number. guess again";
            System.out.println(result);
        }
        System.out.println("GOODBYE");
        return result;}
    }
