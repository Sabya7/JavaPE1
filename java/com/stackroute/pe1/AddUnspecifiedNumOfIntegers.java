package com.stackroute.pe1;
//a program that reads an unspecified number of integer arguments using Scanner Class
//and adds them together. The program should display total of the given input number and should
//only consider integer value.The program should display an error message if there are any non
//integer values.
import java.util.Scanner;

public class AddUnspecifiedNumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner("System.in");
        String input=scanner.nextLine();
        System.out.println(sumPrint(input));
    }

     static int sumPrint(String s)
    { int result=0;
        String[] resArr=s.split(" ");
        int length=resArr.length;
        for(int i=0;i<length;i++)
        {
            result+=Integer.parseInt(resArr[i]);
        }
       /* Scanner ss= new Scanner(System.in);
        int sum=0; String s;
        while(true)
        {
            if(ss.hasNextInt())
                sum+=ss.nextInt();
            else {
                s = ss.nextLine();
                if (s.equals("!"))
                    break;

                System.out.println(s +" error");
            }
        }
        System.out.println(sum);*/
       return result;

    }
}
