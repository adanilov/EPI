package com.mycompany.app._11_Heaps;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.mycompany.app._11_Heaps.Task_11_5.onlineMedian;

public class Task_11_5_Test extends TestCase {

    private static void smallTest() {
        List<Double> globalResult;
        List<Integer> stream = Arrays.asList(5, 4, 3, 2, 1);
        globalResult = onlineMedian(stream.iterator());
        List<Double> golden = Arrays.asList(5.0, 4.5, 4.0, 3.5, 3.0);
        assert golden.equals(globalResult);

        globalResult.clear();
        stream = Arrays.asList(1, 2, 3, 4, 5);
        globalResult = onlineMedian(stream.iterator());
        golden = Arrays.asList(1.0, 1.5, 2.0, 2.5, 3.0);
        assert golden.equals(globalResult);

        globalResult.clear();
        stream = Arrays.asList(1, 0, 3, 5, 2, 0, 1);
        globalResult = onlineMedian(stream.iterator());
        golden = Arrays.asList(1.0, 0.5, 1.0, 2.0, 2.0, 1.5, 1.0);
        assert golden.equals(globalResult);

        globalResult.clear();
        stream = Arrays.asList(-1);
        globalResult = onlineMedian(stream.iterator());
        golden = Arrays.asList(-1.0);
        assert golden.equals(globalResult);
    }

    public void test0() {
        smallTest();
        Random r = new Random();
        int num = r.nextInt(100000) + 1;
        List<Integer> stream = new ArrayList<>();
        for (int i = 0; i < num; ++i) {
            stream.add(r.nextInt(10000) + 1);
        }
        onlineMedian(stream.iterator());
    }
}
