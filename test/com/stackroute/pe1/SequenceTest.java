package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceTest {
    @Test
    public void SequenceShouldReturn122333()
    {
        Sequence s=new Sequence();
        String result=s.printSequence(3);
        assertEquals("122333",result);
    }
    @Test
    public void SequenceShouldReturn122()
    {
        Sequence s=new Sequence();
        String result=s.printSequence(2);
        assertEquals("122",result);
    }
    @Test
    public void SequenceShouldReturn1()
    {
        Sequence s=new Sequence();
        String result=s.printSequence(1);
        assertEquals("1",result);
    }


}