package com.mycompany.app._7_Strings;

import com.mycompany.app._7_Strings.Task_7_5;
import junit.framework.TestCase;

public class Task_7_5_Test extends TestCase {

    public void test0() {
        assertTrue(Task_7_5.isPalindrome("A man, a plan, a canal, Panama"));
    }

    public void test1() {
        assertFalse(Task_7_5.isPalindrome("Ray a Ray"));
    }
}
