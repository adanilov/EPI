package com.mycompany.app;

import junit.framework.TestCase;

public class Task_7_8_Test extends TestCase {

    public void test0() {
        String number8 = Task_7_8.lookAndSay(8);
        assertTrue(number8.contains("1113213211"));
    }
}
