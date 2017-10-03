package com.mycompany.app._7_Strings;

import com.mycompany.app._7_Strings.Task_7_4;
import junit.framework.TestCase;

import java.util.Arrays;

public class Task_7_4_Test extends TestCase {

    public void test0() {

        char[] s = {'a', 'b', 'a', 'c', '_'};
        int finalSize = Task_7_4.replaceAndRemove(4, s);
        assertTrue(finalSize == 5);
        assertTrue(Arrays.equals(s, new char[]{'d', 'd', 'd', 'd', 'c'}));
    }
}
