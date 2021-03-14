package com.dk.example.springbootjunit5.util;

public class StringHelper
{
    public String reverse(String input){
        if(input==null)return null;
        if(input.isEmpty())return new String();
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
