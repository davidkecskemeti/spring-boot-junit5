package com.dk.example.springbootjunit5.dynamic;

import com.dk.example.springbootjunit5.util.StringHelper;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTestDemo {

    StringHelper stringHelper = new StringHelper();

    @TestFactory
    public DynamicNode testReverse() {
        return DynamicTest.dynamicTest("Dynamic Test for reverse methid", () -> {
            assertEquals(stringHelper.reverse("abc"), "cba");
        });
    }
}
