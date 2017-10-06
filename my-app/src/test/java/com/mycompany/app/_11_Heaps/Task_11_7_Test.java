package com.mycompany.app._11_Heaps;

import junit.framework.TestCase;

import java.util.NoSuchElementException;

public class Task_11_7_Test extends TestCase {

    public void test0() {
        Task_11_7.Stack s = new Task_11_7.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        assert (s.peek().equals(3));
        s.pop();
        assert (s.peek().equals(2));
        s.pop();
        s.push(4);
        assert (s.peek().equals(4));
        s.pop();
        s.pop();
        try {
            s.pop();
            assert (false);
        } catch (NoSuchElementException e) {
            System.out.println("empty stack");
            System.out.println(e.getMessage());
        }

        s.push(0);
        s.push(-1);
        s.push(Integer.MAX_VALUE);
        assert (s.peek().equals(Integer.MAX_VALUE));
        s.pop();
        assert (s.peek().equals(-1));
        s.pop();
        assert (s.peek().equals(0));
        s.pop();
        try {
            s.pop();
            assert (false);
        } catch (NoSuchElementException e) {
            System.out.println("empty stack");
            System.out.println(e.getMessage());
        }
        s.push(0);
        assert (s.peek().equals(0));
    }
}
