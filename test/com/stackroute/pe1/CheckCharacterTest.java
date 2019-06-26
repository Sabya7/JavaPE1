package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCharacterTest {
    @Test
    public void CheckCharacterShouldReturnCapital()
    {
        String result=CheckCharacter.characterCheck('A');
        assertEquals("Capital Letter",result);
    }
    @Test
    public void CheckCharacterShouldReturnSmall()
    {
        String result=CheckCharacter.characterCheck('a');
        assertEquals("Small Letter",result);
    }
    @Test
    public void CheckCharacterShouldReturnDigit()
    {
        String result=CheckCharacter.characterCheck('1');
        assertEquals("Digit",result);
    }
    @Test
    public void CheckCharacterShouldReturnSpecial()
    {
        String result=CheckCharacter.characterCheck('!');
        assertEquals("Special Character",result);
    }

}