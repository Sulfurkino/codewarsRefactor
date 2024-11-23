package com.kinov.kyu7;
//i) Если a = 0 или b = 0, верните [a,b]. В противном случае перейдите к шагу (ii);
//ii) Если a ≥ 2*b, установите a = a - 2*b и повторите шаг (i). В противном случае перейдите к шагу (iii);
//iii) Если b ≥ 2*a, задайте b = b - 2*a и повторите шаг (i). В противном случае верните [a,b].
public class Task6 {
    public static int [] solve(int a, int b){
        while (a != 0 && b != 0) {
            if (a >= 2 * b) {
                a = a - 2 * b;
            } else if (b >= 2 * a) {
                b = b - 2 * a;
            } else {
                break;
            }
        }
        return new int[]{a, b};
    }
}
