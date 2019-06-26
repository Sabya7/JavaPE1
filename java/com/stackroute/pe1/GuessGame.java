package com.stackroute.pe1;

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
