package com.kinov.kyu7;
//Умножьте каждое число на себя.
// - Сложите их все вместе.
// - Возьмите квадратный корень из полученного результата.
// - Разделите на два.
public class Task4 {

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int sumOfSquares = age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 +
                age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8;

        double squareRoot = Math.sqrt(sumOfSquares);

        return (int) Math.floor(squareRoot / 2);
    }

}
