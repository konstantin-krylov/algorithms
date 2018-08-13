package com.algorithm;

public class GCD {
    public static int divider(int A, int B) {
        while (B !=0) {
            int remainder = A % B;
            A = B;
            B = remainder;
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(divider(4851, 3003));
    }
}
