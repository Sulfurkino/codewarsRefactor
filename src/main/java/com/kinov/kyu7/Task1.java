package com.kinov.kyu7;
//Вы получаете начальный и конечный номер области и должны вернуть подсчет всех чисел, кроме чисел с цифрой 5.
public class Task1 {
    public static int dontGiveMeFive(int start, int end)
    {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) {
                count++;
            }
        }
        return count;

    }
}
