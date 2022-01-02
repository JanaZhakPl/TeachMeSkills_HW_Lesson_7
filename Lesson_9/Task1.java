package com.teachmeskills.Lesson_9;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of document in format xxxx-yyy-xxxx-yyy-xyxy");
        Scanner s = new Scanner(System.in);
        String documentNumber = s.nextLine();
        System.out.println("Your document`s number is " + documentNumber);

        // Вывести на экран в одну строку два первых блока по 4 цифры
        System.out.println("First two integer blocks are: "
                + documentNumber.substring(0, 4) + " "
                + documentNumber.substring(9, 13));

        //Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
        System.out.println("Document`s integer blocks are: " +
                documentNumber.replaceAll("[a-zA-Z]", "").replace("--", "-"));

        //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
        String str = "Letters: ";
        Formatter f = new Formatter();
        f.format("%s/%s/%s/%s",
                documentNumber.substring(5, 8), documentNumber.substring(14, 17),
                documentNumber.charAt(19), documentNumber.charAt(21));
        System.out.println(str + f.toString().toLowerCase());

        //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
        //(реализовать с помощью класса StringBuilder)
        StringBuilder formatLettersString = new StringBuilder();
        String lettersBlock1 = (documentNumber.substring(5, 8) + "/").toUpperCase();
        String lettersBlock2 = (documentNumber.substring(14, 17) + "/").toUpperCase();
        String lettersBlock3 = ((documentNumber.charAt(19) + "/" + documentNumber.charAt(21)).toUpperCase());
        System.out.println("Letters: " + formatLettersString.append(lettersBlock1).append(lettersBlock2).append(lettersBlock3));

        //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
        // (причем, abc и ABC считается одинаковой последовательностью).

        if (documentNumber.toLowerCase().contains("abc")){
            System.out.println("Document number contains abc");
        } else {
            System.out.println("Document number doesn`t contain abc");
        }

        // Проверить начинается ли номер документа с последовательности 555.
        if(documentNumber.startsWith("555")){
            System.out.println("Document number starts with 555");
        } else {
            System.out.println("Document number doesn`t start with 555");
        }

        //Проверить заканчивается ли номер документа на последовательность 1a2b.
        if(documentNumber.endsWith("1a2b")){
            System.out.println("Document number ends with 1a2b");
        } else {
            System.out.println("Document number doesn`t end with 1a2b");
        }
    }
}

//1234-aBc-5678-def-9j1H
//5554-aBc-5678-def-9j1H
//1234-aBc-5678-def-1a2b
