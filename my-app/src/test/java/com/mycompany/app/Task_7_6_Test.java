package com.mycompany.app;

import junit.framework.TestCase;

import java.util.Arrays;

public class Task_7_6_Test extends TestCase {

    public void test0() {
        char[] s = "Alice likes Bob".toCharArray();
        Task_7_6.reverseWords(s);
        assertTrue(Arrays.equals(s, "Bob likes Alice".toCharArray()));
    }

    public void test1() {
        char[] s = "ram is costly".toCharArray();
        Task_7_6.reverseWords(s);
        assertTrue(Arrays.equals(s, "costly is ram".toCharArray()));
    }

    public void test2() {
        char[] s = "q".toCharArray();
        Task_7_6.reverseWords(s);
        assertTrue(Arrays.equals(s, "q".toCharArray()));
    }
}
