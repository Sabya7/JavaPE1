package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DetermineVowelOrConsonantTest {

    @Test
    public void DVCShouldReturnVowel()
        {
        DetermineVowelOrConsonant dvc=new DetermineVowelOrConsonant();
        String result=dvc.determine("ae");
        assertEquals("VOWELVOWEL",result);
    }

    @Test
    public void DVCShouldReturnCONSONANT()
    {
        DetermineVowelOrConsonant dvc=new DetermineVowelOrConsonant();
        String result=dvc.determine("bc");
        assertEquals("CONSONANTCONSONANT",result);
    }
    @Test
    public void DVCShouldReturnCONSONANTVOWEL()
    {
        DetermineVowelOrConsonant dvc=new DetermineVowelOrConsonant();
        String result=dvc.determine("ba");
        assertEquals("CONSONANTVOWEL",result);
    }
}