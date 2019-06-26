package com.stackroute.pe1;

import java.util.Scanner;

public class DetermineVowelOrConsonant {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("enter a string \n");
        String input = ss.nextLine();
        DetermineVowelOrConsonant dvc=new DetermineVowelOrConsonant();
        System.out.println(dvc.determine(input));
    }

      String determine(String s) {
        char[] arr = s.toCharArray(); String result="";
        for(char c : arr) {
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                    result+="VOWEL";
                else
                    result+="CONSONANT";
            } else {
                result+="is not a letter";
            }
        }
        return result;
    }
}