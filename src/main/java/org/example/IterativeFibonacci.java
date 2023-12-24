package org.example;

public class IterativeFibonacci {

    // має часову складність O(n) і просторову складність O(1)
    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
