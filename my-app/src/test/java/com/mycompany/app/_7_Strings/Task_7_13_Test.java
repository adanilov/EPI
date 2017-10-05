package com.mycompany.app._7_Strings;

import junit.framework.TestCase;

import java.io.IOException;

public class Task_7_13_Test extends TestCase {

    public void test0() throws IOException {

        String tail = Task_7_13.tail("src/test/resources/testFile.txt", 3);

        String expected = "line4\nline5\nline6\nline7";

        assertTrue(tail.equals(expected));
    }
}
