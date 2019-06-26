package com.stackroute.pe1;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a char");
        String s=scanner.nextLine();
        char c=s.charAt(0);
        System.out.println(characterCheck(c));
    }
     static String characterCheck(char c)
    {
        if(Character.isLetterOrDigit(c))
        {
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))
                    return "Capital Letter";
                else
                    return "Small Letter";
            }
            else
            {
                return "Digit";
            }
        }
        else
            return "Special Character";
    }
}
