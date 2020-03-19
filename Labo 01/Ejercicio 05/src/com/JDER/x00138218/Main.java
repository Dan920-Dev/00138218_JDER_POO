package com.JDER.x00138218;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Digite el numero de letras que va a ingresar: ");
        int num = in.nextInt(); in.nextLine();
        char[] list = new char[num];

        System.out.println("Digite las letras una por una: ");
        for(int i = 0; i < num; i++){
            list[i] = in.next().charAt(0);
        }

        ArrayList voc = new ArrayList();

        for(int  i = 0; i < num; i++){
            if(avoc(list[i]))
                voc.add(list[i]);
        }

        System.out.println("Mostrando Lista llena de vocales: ");
        voc.forEach(System.out::print);

    }

    static boolean avoc(char c){
        switch (c){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
