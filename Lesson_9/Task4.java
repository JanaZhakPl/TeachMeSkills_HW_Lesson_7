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
        String sentence = "one two three five six seven eight nine ten";
        String[] words = sentence.split(" ");
        System.out.println(words.length);

        int elementNumber = getElementNumber();
        String word = words[elementNumber];

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }


    private static int getElementNumber() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of element (word): ");

            int elementNumber = scanner.nextInt();
            if (elementNumber < 9) {  //how can I use WORDS.LENGTH instead number 9
                return elementNumber;
            }
            System.out.println ("There are only " + 9 + " words in the sentence");//how can I use WORDS.LENGTH instead number 9
        }

    }
}


