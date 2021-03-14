package com.dk.example.springbootjunit5.annotaion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAnnotationDemo {

    @Test
    public void test(){
        assertEquals(2,2);
    }
}
