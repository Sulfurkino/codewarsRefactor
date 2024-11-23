package com.kinov.kyu7;
//Определите общее количество цифр в целом числе (n>=0)
// Например, 9 - это одна цифра, 66 - 2 цифры, а 128685 - 6 цифр
public class Task3 {
    public static int Digits(long n) {
        int count = 0;
        do {
            count++;
            n /= 10;
        } while (n > 0);
        return count;
    }
}
