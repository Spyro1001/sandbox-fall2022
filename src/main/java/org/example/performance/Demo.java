package org.example.performance;

public class Demo {

    public static void main(String[] args) {
        int a, b;
        b = 2;
        a = 42;
        // O(1)
        if (a < 10) {
            // do something
        }

        // O(n)
        int n = 1000;
        for(int x = 1; x < n; x++) {
            // O(1)
            if (a < 10) {
                // do something
            }
        }
        // O(1) * O(n)

        // O(n^2)
        for (int y = 1; y < 10; y++) {
            for(int x = 1; x < 200000000; x++) {
                // O(1)
                if (a < 10) {
                    // do something
                }
            }
        }
        // O(1) * O(n) * O(n) = O(n^2)

        // O(n^3)
        for (int z = 1; z <= 800; z++) {
            for (int y = 1; y < 10; y++) {
                for(int x = 1; x < 200000000; x++) {
                    // O(1)
                    if (a < 10) {
                        // do something
                    }
                }
            }
        }

        // addition example
        for (int x = 1; x <= 10; x++) {

        }
        // +
        for(int y = 1; y <= 100; y++) {

        }

        // O(n) + O(n) = 2 * O(n) = O(2n) = O(n)


        for (int x = 1; x <= 10; x++) {
            // *
            for (int z = 1; z <= 10; z++) {

            }
        }
        // +
        for(int y = 1; y <= 100; y++) {

        }
        // O(n^2) + O(n) = O(n^2 + n) = O(n^2)
    }
}
