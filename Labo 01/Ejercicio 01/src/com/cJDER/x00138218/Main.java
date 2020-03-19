package com.cJDER.x00138218; //En el paquete pase tiene una letra c de mas, deberia de ser: ackage com.JDER.x00138218;
                            // No me percate del error! :/
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Serie Fibonacci");
        System.out.printf("Digite el valor de n: ");
        int n = in.nextInt(); in.nextLine();

        int previous = 0, current = 1, aux = 0;

        if(n == 1){
            System.out.printf("1");
        }

        if(n > 1){
            for(int i = 0; i < n; i++){
                System.out.printf(current + " ");
                aux = current;
                current = current + previous;
                previous = aux;
            }
        }else{
            System.out.println("Numero Invalido");
        }

    }
}
