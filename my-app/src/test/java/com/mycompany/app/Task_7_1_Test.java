package com.mycompany.app;

import junit.framework.TestCase;

public class Task_7_1_Test extends TestCase {


    public void test0() {
        assertTrue(Task_7_1.intToString(-345).equals("-345"));
    }

    public void test1() {
        assertTrue(Task_7_1.stringToInt("-345") == -345);
    }

}
