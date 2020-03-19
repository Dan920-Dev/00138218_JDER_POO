package com.JDER.x00138218;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Digite una frase: ");
        String sentence = in.nextLine();

        sentence = sentence.replaceAll("a","b"); // Reemplaza las letras

        System.out.printf(sentence);
    }
}
