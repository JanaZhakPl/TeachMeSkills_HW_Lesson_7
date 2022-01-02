package com.teachmeskills.Lesson_9;

/**
 * 3. Дана строка произвольной длины с произвольными словами.
 *   Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
 *   Если таких слов несколько, найти первое из них.
 *   Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */
public class Task3 {
    public static void main(String[] args) {

        String string = "fffff ab f 1234 jkjk";
        String [] parts = string.split(" ");

        int[] counts = new int [parts.length];
        int count = 1;

        for (int i = 0; i < parts.length; i++){
            for (int j = 0 ; j < parts[i].length()-1; j++){
             char element = parts[i].charAt(j+1);

                if (parts[i].charAt(j) != element){
                    count += 1;
                }
            }
            counts[i] = count;
            count = 1;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
    }





}
