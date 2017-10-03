package com.mycompany.app._7_Strings;

import com.mycompany.app._7_Strings.Task_7_2;
import junit.framework.TestCase;

public class Task_7_2_Test extends TestCase {

    public void test0() {
        assertTrue(Task_7_2.convertBase("615", 7, 13).equals("1A7"));
    }

    public void test1() {
        assertTrue(Task_7_2.convertBase("0", 7, 13).equals("0"));
    }

}
