package com.mycompany.app._11_Heaps;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Task_11_4 {

    public static class Star implements Comparable<Star>, Serializable {
        private double x, y, z;

        public Star(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double distance() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        public int compareTo(Star rhs) {
            return Double.compare(this.distance(), rhs.distance());
        }
    }

    public static List<Star> findClosestKStars(int k, Iterator<Star> osin) {
        throw new UnsupportedOperationException();
    }
}
