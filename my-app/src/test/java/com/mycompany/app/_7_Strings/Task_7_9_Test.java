package com.mycompany.app._7_Strings;

import com.mycompany.app._7_Strings.Task_7_9;
import junit.framework.TestCase;

public class Task_7_9_Test extends TestCase {

    public void test0() {
        int integer = Task_7_9.romanToInteger("IC");
        assertTrue(integer == 99);
    }
}
