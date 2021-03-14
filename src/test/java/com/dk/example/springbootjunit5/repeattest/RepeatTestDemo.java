package com.dk.example.springbootjunit5.repeattest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatTestDemo {

    @RepeatedTest(value = 5,name = "{displayName} - {currentRepetition} / {totalRepetitions}")
    @DisplayName("Simple Repated Test")
    public void  simpleRepeatedTest(){
        assertTrue(0<5);
    }

    @RepeatedTest(value = 5,name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Simple Repated Test")
    public void  simpleRepeatedTestWithLongDisplayName(){
        assertTrue(0<4);
    }
}
