package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonIncreasingSortTest {
    @Test
    public void NonIncreasingSortTestShouldreturnCorrect(){
        String result= NonIncreasingSort.sort(12345);
        assertEquals("54321",result);
    }
    @Test
    public void NonIncreasingSortTestShouldreturnCorr(){
        String result= NonIncreasingSort.sort(12543);
        assertEquals("54321",result);
    }
}