package com.stackroute.pe1;
//a program which accepts a number as input and check whether the given number is
//palindrome or not If it is a palindrome then
//a. Add all the even numbers and check whether the sum is more than 25.
//b. Print success and failure messages for all 3 conditions
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("enter the number\n");
        Scanner ss = new Scanner(System.in);
        int input = ss.nextInt();
        System.out.println(palindrome(input));
    }
         static boolean palindrome(int number)
        {
            StringBuffer string = new StringBuffer(Integer.toString(number));
            String a = new String(string);
            String b = new String(string.reverse());
            if (a.equals(b)) {
                System.out.println("is a palindrome\n");
            } else
                System.out.println("is not a palindrome");

            int digitPosition = 0;
            String resultant = string.toString();
            number = Integer.parseInt(resultant);
            int sum = 0;
            while (number > 0) {
                digitPosition++;
                if (digitPosition % 2 == 0) {
                    sum += number % 10;
                }
                number = number / 10;
            }
            System.out.println(sum);
            if (sum < 25) {
                System.out.println("sum of even nos. is less than 25");
            } else {
                System.out.println("sum of even nos. is greater than 25");

            }
            return a.equals(b);
        }
    }

