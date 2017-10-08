package com.mycompany.app._13_Hashtables;

import junit.framework.TestCase;

public class Task_13_4_Test extends TestCase {

    public void test0() {
        final int CAPACITY = 2;
        Task_13_4.LRUCache c = new Task_13_4.LRUCache(CAPACITY);
        System.out.println("c.insert(1, 1)");
        c.insert(1, 1);
        System.out.println("c.insert(1, 10)");
        c.insert(1, 10);
        System.out.println("c.lookup(2, val)");
        assert (null == c.lookup(2));
        System.out.println("c.lookup(1, val)");
        assert (c.lookup(1) == 1);
        c.erase(1);
        assert (null == c.lookup(1));

        // test capacity constraints honored, also FIFO ordering
        c = new Task_13_4.LRUCache(CAPACITY);
        c.insert(1, 1);
        c.insert(2, 1);
        c.insert(3, 1);
        c.insert(4, 1);
        assert (null == c.lookup(1));
        assert (null == c.lookup(2));
        assert (1 == c.lookup(3));
        assert (1 == c.lookup(4));

        // test retrieval moves to front
        c = new Task_13_4.LRUCache(CAPACITY);
        c.insert(1, 1);
        c.insert(2, 1);
        c.insert(3, 1);
        c.lookup(2);
        c.insert(4, 1);
        assert (null == c.lookup(1));
        assert (1 == c.lookup(2));
        assert (null == c.lookup(3));
        assert (1 == c.lookup(4));

        // test update moves to front
        c = new Task_13_4.LRUCache(CAPACITY);
        c.insert(1, 1);
        c.insert(2, 1);
        c.insert(3, 1);
        c.insert(2, 2);
        c.insert(4, 1);
        assert (null == c.lookup(1));
        assert (1 == c.lookup(2));
        assert (null == c.lookup(3));
        assert (1 == c.lookup(4));

        // test erase
        c = new Task_13_4.LRUCache(CAPACITY);
        c.insert(1, 1);
        c.insert(2, 1);
        c.erase(2);
        c.insert(3, 3);
        assert (1 == c.lookup(1));
        assert (null == c.lookup(2));
        assert (3 == c.lookup(3));
    }

}
