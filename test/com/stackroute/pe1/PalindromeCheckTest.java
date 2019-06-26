package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {


    @Test
    public void PalindromeShouldReturnFalse()
    {
        PalindromeCheck pc=new PalindromeCheck();
        boolean result=pc.palindrome(123);
        assertEquals(false,result);
    }
    @Test
    public void PalindromeShouldReturnTrue()
    {
        PalindromeCheck pc=new PalindromeCheck();
        boolean result=pc.palindrome(123321);
        assertEquals(true,result);
    }
}