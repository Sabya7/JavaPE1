package com.stackroute.pe1;
//a program which accepts a number as input from user and perform the following:
//a. sort the number in non-increasing order
//b. after sorting sum all the even numbers, the sum should be greater than 15 .
//c. if sum is more than 15,then print output as true or false.
import java.util.Arrays;
import java.util.Scanner;

public class NonIncreasingSort {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(sort(input));}

         static String sort( int number){
            String s = Integer.toString(number);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            s = new String(c);
            StringBuffer ns = new StringBuffer(s);
            ns = ns.reverse();
            number = Integer.parseInt(s);
            System.out.println(ns);
            int sum = 0, count = 0;
            while (number > 0) {
                count++;
                if (count % 2 == 0) {
                    sum += number % 10;
                }
                number = number / 10;
            }
            System.out.println("Sum of even numbers : " + sum);
            if (sum > 15) System.out.println("true");
            else System.out.println("false");
             return ns.toString();
        }


    }
