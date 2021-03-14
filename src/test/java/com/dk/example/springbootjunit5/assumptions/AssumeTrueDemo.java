package com.dk.example.springbootjunit5.assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumeTrueDemo {

    @Test
    public void assumeTrueWithNoMessage(){
        assumeTrue("DEV".equals(System.getProperty("ENV")));
        assertEquals(3,2+1);
    }
}
