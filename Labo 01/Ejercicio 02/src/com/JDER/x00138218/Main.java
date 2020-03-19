package com.JDER.x00138218;

import java.util.Scanner;

public class Main {
    static Scanner in= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("¿La frase ingresada es Palindrome? " + funPalindrome());

    }

    static boolean funPalindrome() {
        System.out.printf("Digite una frase, el programa determinara si es palindrome o no!");
        String sentence= in.nextLine();

        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("\\s", "");
        int size = sentence.length();

        for (int i = 0; i < size; i++) {
            if (sentence.charAt(i) == sentence.charAt(size - 1 - i)) return true;
        }

        return false;
    }

}
