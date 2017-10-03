package com.mycompany.app._11_Heaps;

import junit.framework.TestCase;

import java.util.*;

public class Task_11_1_Test extends TestCase {

    private static void check(List<List<Integer>> S, List<Integer> ans,
                              List<Integer> golden) {
        if (!ans.equals(golden)) {
            System.err.println("Your program failed on input " + S);
            System.err.println("Expected " + golden);
            System.err.println("Got " + ans);
            System.exit(-1);
        }
    }

    private static void simpleTest() {
        List<List<Integer>> S
                = Arrays.asList(Arrays.asList(1, 5, 10), Arrays.asList(2, 3, 100),
                Arrays.asList(2, 12, Integer.MAX_VALUE));
        List<Integer> ans = Task_11_1.mergeSortedArrays(S);
        List<Integer> golden
                = Arrays.asList(1, 2, 2, 3, 5, 10, 12, 100, Integer.MAX_VALUE);
        check(S, ans, golden);

        S = Arrays.asList(Arrays.asList(1));
        ans = Task_11_1.mergeSortedArrays(S);
        golden = Arrays.asList(1);
        check(S, ans, golden);

        S = Arrays.asList(new ArrayList<Integer>(), Arrays.asList(1),
                Arrays.asList(2));
        ans = Task_11_1.mergeSortedArrays(S);
        golden = Arrays.asList(1, 2);
        check(S, ans, golden);
    }

    public void test0() {
        simpleTest();
        Random rnd = new Random();
        for (int times = 0; times < 100; ++times) {
            int n = 1 + rnd.nextInt(100);

            List<List<Integer>> S = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                int m = rnd.nextInt(500);
                List<Integer> last = new ArrayList<>(m);
                S.add(last);
                for (int j = 0; j < m; ++j) {
                    last.add(rnd.nextInt(500));
                }
                Collections.sort(last);
            }

            List<Integer> ans = Task_11_1.mergeSortedArrays(S);
            for (int i = 1; i < ans.size(); ++i) {
                assert (ans.get(i - 1) <= ans.get(i));
            }
        }
    }
}
