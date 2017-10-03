package com.mycompany.app._7_Strings;

import java.util.HashMap;
import java.util.Map;

public class Task_7_9 {

    public static int romanToInteger(String s) {

        Map<Character, Integer> T = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        throw new UnsupportedOperationException();
    }
}
