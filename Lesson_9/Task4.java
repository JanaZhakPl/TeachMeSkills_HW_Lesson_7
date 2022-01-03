package com.teachmeskills.Lesson_9;

import java.util.Scanner;

/**
 * 4. Дана строка произвольной длины с произвольными словами.
 *   Написать программу для проверки является ли любое выбранное слово в строке полиндромом.
 *   Например, есть строка, вводится число 3, значит необходимо проверить является ли 3ей слово в этой строке полиндромом.
 *   Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов,
 *   а на вход программе передали число 500 и т.п. ситуации.
 */

public class Task4 {
    public static void main(String[] args) {
        String sentence = "ono two three five six seven eight nine ten 11";
        String[] words = sentence.split(" ");
        System.out.println(words.length);

        int elementNumber = getElementNumber(words.length);
        String word = words[elementNumber];

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }


    private static int getElementNumber(int arrayLength) {
        while (true) {

            System.out.print("Enter number of element (word): ");
            Scanner scanner = new Scanner(System.in);
            int elementNumber = scanner.nextInt();
            if (elementNumber <= arrayLength ) {
                return elementNumber - 1;
            }
            System.out.println ("There are only " + arrayLength + " words in the sentence");
        }
    }
}


