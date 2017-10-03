package com.mycompany.app._11_Heaps;

import com.mycompany.app._11_Heaps.Task_11_4.Star;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static com.mycompany.app._11_Heaps.Task_11_4.findClosestKStars;

public class Task_11_4_Test extends TestCase {


    private static void simpleTest() {
        List<Task_11_4.Star> stars = new ArrayList<>();
        stars.add(new Task_11_4.Star(1, 2, 3));
        stars.add(new Task_11_4.Star(5, 5, 5));
        stars.add(new Task_11_4.Star(0, 2, 1));
        stars.add(new Task_11_4.Star(9, 2, 1));
        stars.add(new Task_11_4.Star(1, 2, 1));
        stars.add(new Star(2, 2, 1));

        List<Star> closestStars = findClosestKStars(3, stars.iterator());
        assert (3 == closestStars.size());
        assert (0 == closestStars.get(0).compareTo(new Star(0, 2, 1)));
        assert (0 == closestStars.get(0).compareTo(new Star(2, 0, 1)));
        assert (0 == closestStars.get(1).compareTo(new Star(1, 2, 1)));
        assert (0 == closestStars.get(1).compareTo(new Star(1, 1, 2)));

        stars = new ArrayList<>();
        stars.add(new Star(1, 2, 3));
        stars.add(new Star(5, 5, 5));
        stars.add(new Star(4, 4, 4));
        stars.add(new Star(3, 2, 1));
        stars.add(new Star(5, 5, 5));
        stars.add(new Star(3, 2, 3));
        stars.add(new Star(3, 2, 3));
        stars.add(new Star(3, 2, 1));
        closestStars = findClosestKStars(2, stars.iterator());
        assert (2 == closestStars.size());
        assert (0 == closestStars.get(0).compareTo(new Star(1, 2, 3)));
        assert (0 == closestStars.get(1).compareTo(new Star(3, 2, 1)));
    }

    public void test0() {
        simpleTest();
        Random r = new Random();
        for (int times = 0; times < 1000; ++times) {
            int num, k;
            num = r.nextInt(10000) + 1;
            k = r.nextInt(num) + 1;
            List<Task_11_4.Star> stars = new ArrayList<>();
            // Randomly generate num of stars
            for (int i = 0; i < num; ++i) {
                stars.add(
                        new Star(r.nextInt(100001), r.nextInt(100001), r.nextInt(100001)));
            }
            List<Star> closestStars = findClosestKStars(k, stars.iterator());
            Collections.sort(closestStars);
            Collections.sort(stars);
            assert (0
                    == stars.get(k - 1).compareTo(
                    closestStars.get(closestStars.size() - 1)));
        }
    }
}
