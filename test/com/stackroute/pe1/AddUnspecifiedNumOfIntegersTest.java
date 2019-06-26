package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddUnspecifiedNumOfIntegersTest {

    @Test public void AddShouldReturnSum()
    {
        AddUnspecifiedNumOfIntegers ad=new AddUnspecifiedNumOfIntegers();
        int result= AddUnspecifiedNumOfIntegers.sumPrint("20 30 40 50");
        assertEquals(140,result);
    }
    @Test public void AddShouldReturnSum120()
    {
        AddUnspecifiedNumOfIntegers ad=new AddUnspecifiedNumOfIntegers();
        int result= AddUnspecifiedNumOfIntegers.sumPrint("30 40 50");
        assertEquals(120,result);
    }

}