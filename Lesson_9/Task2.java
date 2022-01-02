package com.teachmeskills.Lesson_9;

import java.util.Scanner;

/**
 *  Дана строка произвольной длины с произвольными словами.
 *   Найти самое короткое слово в строке и вывести его на экран.
 *   Найти самое длинное слово в строке и вывести его на экран.
 *   Если таких слов несколько, то вывести последнее из них.
 */

public class Task2 {
    public static void main(String[] args) {

        String sentence = "one two three five six seven eight nine ten";
        String[] words = sentence.split(" ");

        String shortestWord = words[0];
            for (int i = 1; i < words.length; i++){
            if (words[i].length() <= shortestWord.length())
                shortestWord = words[i];
            }
         String longestWord = words[0];
            for (int i = 1; i < words.length; i++){
            if (words[i].length() >= longestWord.length())
                longestWord = words[i];
        }
        System.out.println(shortestWord);
        System.out.println(longestWord);
        }
}




