package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessGameTest {

    @Test
    public void GuessGameShouldReturnCorrectly()
    {
        String result=GuessGame.guess(47);
        assertEquals("you guessed correctly",result);
    }
}