package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsejavajaxrs1 {

      Csejavajaxrs1Delegate csejavajaxrs1Delegate = new Csejavajaxrs1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = csejavajaxrs1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
