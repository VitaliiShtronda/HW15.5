package org.example;

public class RecursiveFibonacci {

    // має часову складність O(2^n) і просторову складність O(n)
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}
