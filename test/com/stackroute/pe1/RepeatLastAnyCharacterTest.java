package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatLastAnyCharacterTest {
@Test
    public void RLACShouldReturnStackrouteroute()
{
    String result=RepeatLastAnyCharacter.repeatChar("Stackroute",2);
    assertEquals("Stackroutetete",result);
}
    @Test
    public void RLACShouldReturnStackroutee()
    {
        String result=RepeatLastAnyCharacter.repeatChar("Stackroute",1);
        assertEquals("Stackroutee",result);
    }
}