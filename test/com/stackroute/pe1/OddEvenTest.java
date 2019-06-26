package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {

    @Test
    public void OddEvenShouldReturnPrompt()
    {
        OddEven pc=new OddEven();
        String result=pc.checkOdd(40);
        assertEquals("number should be in between 20 and 30",result);
    }
    @Test
    public void OddEvenShouldReturnTOM()
    {
        OddEven pc=new OddEven();
        String result=pc.checkOdd(21);
        assertEquals("TOM",result);
    }
    @Test
    public void OddEvenShouldReturnJERRY()
    {
        OddEven pc=new OddEven();
        String result=pc.checkOdd(22);
        assertEquals("JERRY",result);
    }
}