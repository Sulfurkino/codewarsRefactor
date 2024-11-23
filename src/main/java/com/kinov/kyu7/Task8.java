package com.kinov.kyu7;
//убрать все гласные из строчки
public class Task8 {
    public static String disemvowel(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                result.append(c);
            }
        }

        return result.toString();
    }
}
