package com.kinov.kyu7;
//Напишите функцию, которая удваивает каждое второе целое число в списке, начиная слева.

public class Task2 {
    public static int[] doubleEveryOther(int[] a) {
        for (int i = 1; i < a.length; i+=2) {
            a[i] *= 2;
        }
        return a;
    }
}
