package com.mycompany.app._7_Strings;

import com.mycompany.app._7_Strings.Task_7_7;
import junit.framework.TestCase;

import java.util.List;

public class Task_7_7_Test extends TestCase {

    public void test0() {
        List<String> strings = Task_7_7.phoneMnemonics("2276696");

        assertTrue(strings.contains("ACRONYM"));
        assertTrue(strings.contains("ABPOMZN"));
    }
}
