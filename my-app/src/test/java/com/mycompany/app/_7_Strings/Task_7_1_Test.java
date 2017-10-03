package com.mycompany.app._7_Strings;

import com.mycompany.app._7_Strings.Task_7_1;
import junit.framework.TestCase;

public class Task_7_1_Test extends TestCase {


    public void test0() {
        assertTrue(Task_7_1.intToString(345).equals("345"));
    }

    public void test1() {
        assertTrue(Task_7_1.intToString(-345).equals("-345"));
    }

    public void test2() {
        assertTrue(Task_7_1.stringToInt("345") == 345);
    }

    public void test3() {
        assertTrue(Task_7_1.stringToInt("-345") == -345);
    }

    public void test4() {
        assertTrue(Task_7_1.stringToInt("0") == 0);
    }

}
