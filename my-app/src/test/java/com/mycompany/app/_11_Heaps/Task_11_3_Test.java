package com.mycompany.app._11_Heaps;

import junit.framework.TestCase;

import java.util.*;

import static com.mycompany.app._11_Heaps.Task_11_3.sortApproximatelySortedData;

public class Task_11_3_Test extends TestCase {


    private static List<Integer> result;

    // It should return 1, 2, 3, 4, 5, 6, 7, 8, 9.
    private static void simpleTest() {
        List<Integer> A = Arrays.asList(2, 1, 5, 4, 3, 9, 8, 7, 6);
        result = sortApproximatelySortedData(A.iterator(), 3);
        assert (result.equals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }

    public void test0() {
        simpleTest();
        Random r = new Random();
        int n = r.nextInt(100000) + 1;
        System.out.println("n = " + n);
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            A.add(r.nextInt(999999) + 1);
        }
        result = sortApproximatelySortedData(A.iterator(), n - 1);
        // Check result is sorted.
        List<Integer> tmp = new ArrayList<>(result);
        Collections.sort(tmp);
        assert (result.equals(tmp));
        // Check result contains stream entries.
        assert (new TreeSet<>(result).equals(new TreeSet<>(A)));
    }


}
