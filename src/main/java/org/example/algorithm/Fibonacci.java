package org.example.algorithm;

import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n) {

        // base cases
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            System.out.println(fib(n));
        }

    }

}
