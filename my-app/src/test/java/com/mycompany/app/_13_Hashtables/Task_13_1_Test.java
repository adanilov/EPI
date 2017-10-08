package com.mycompany.app._13_Hashtables;

import junit.framework.TestCase;

import java.util.*;

import static com.mycompany.app._13_Hashtables.Task_13_1.findAnagrams;

public class Task_13_1_Test extends TestCase {

    private static void smallTest() {
        List<String> dictionary
                = Arrays.asList("debit card", "bad credit", "the morse code",
                "here come dots", "the eyes", "they see", "THL");
        List<List<String>> result = findAnagrams(dictionary);
        assert result.size() == 3;
    }

    private static String randString(int len) {
        StringBuilder ret = new StringBuilder();
        Random rnd = new Random();

        while (len-- > 0) {
            ret.append((char) (rnd.nextInt(26) + 97));
        }
        return ret.toString();
    }

    public void test0() {
        smallTest();
        Random rnd = new Random();
        int n = rnd.nextInt(100000);
        Set<String> table = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            table.add(randString(rnd.nextInt(12) + 1));
        }
        List<String> dictionary = new ArrayList<>();
        for (String s : table) {
            dictionary.add(s);
        }
        findAnagrams(dictionary);
    }
}
