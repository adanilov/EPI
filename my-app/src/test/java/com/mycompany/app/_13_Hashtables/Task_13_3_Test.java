package com.mycompany.app._13_Hashtables;

import junit.framework.TestCase;

import java.util.Random;

import static com.mycompany.app._13_Hashtables.Task_13_3.isLetterConstructibleFromMagazine;

public class Task_13_3_Test extends TestCase {


    private static String randString(int len) {
        StringBuilder ret = new StringBuilder();
        Random rnd = new Random();

        while (len-- > 0) {
            ret.append((char) (rnd.nextInt(26) + 97));
        }
        return ret.toString();
    }


    private static void check(String letter, String magazine, boolean expected) {
        if (expected != isLetterConstructibleFromMagazine(letter, magazine)) {
            System.err.println("Your program incorrectly reports that "
                    + (letter.length() > 0 ? letter : "the empty string")
                    + " is" + (expected ? " not" : "")
                    + " constructible from " + magazine);
            System.exit(-1);
        }
    }

    private static void simpleTest() {
        check("123", "456", false);
        check("123", "12222222", false);
        check("123", "1123", true);
        check("123", "123", true);
        check("12323", "123", false);
        check("GATTACA", "A AD FS GA T ACA TTT", true);
        check("a", "", false);
        check("aa", "aa", true);
        check("aa", "aaa", true);
        check("", "123", true);
        check("", "", true);
    }

    public void test0() {
        simpleTest();
        Random rnd = new Random();
        String L = randString(rnd.nextInt(1000) + 1);
        String M = randString(rnd.nextInt(100000) + 1);
        System.out.println(L);
        System.out.println(M);
        System.out.println(isLetterConstructibleFromMagazine(L, M) ? "true"
                : "false");
    }
}
