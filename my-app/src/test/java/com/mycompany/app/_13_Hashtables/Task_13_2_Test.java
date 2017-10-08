package com.mycompany.app._13_Hashtables;

import junit.framework.TestCase;

import static com.mycompany.app._13_Hashtables.Task_13_2.canFormPalindrome;

public class Task_13_2_Test extends TestCase {
    public void test0() {
        boolean can = canFormPalindrome("s");
        assert (can == true);
        can = canFormPalindrome("edified");
        assert (can == true);
        can = canFormPalindrome("alexel");
        assert (can == false);
    }
}
