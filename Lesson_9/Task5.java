package com.teachmeskills.Lesson_9;

import java.util.Scanner;

/**
 *  5. Дана произвольная строка.
 *   Вывести на консоль новую строку, которой задублированно каждая буква из начальной строки.
 *   Например, "Hello" -> "HHeelllloo"
 */
public class Task5 {
    public static void main(String[] args) {
        String text = "Hello world!";

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                System.out.print(text.charAt(i) + "" + text.charAt(i));
            }else{
                System.out.print(text.charAt(i));
            }
        }
    }

}