package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void StringReverseShouldReturnDog()
    {
        String result=StringReverse.reverse("GOD");
        assertEquals("DOG",result);
    }
    @Test
    public void StringReverseShouldReturntihoR()
    {
        String result=StringReverse.reverse("Rohit");
        assertEquals("tihoR",result);
    }
}