package com.JDER.x00138218;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("Digite el valor de n: ");
        int n = in.nextInt(); in.nextLine();

        if(n > 0){
            funRecursive(n, 1, true);
        }else{
            System.out.println("Numero ingresado es invalido!");
        }
    }

    static void funRecursive(int n, int baseNumber, boolean valid){

        if(valid) {
            if(baseNumber < n){
                System.out.printf(baseNumber + " ");
                baseNumber++;
                funRecursive(n, baseNumber, valid);
            }else{

                if(baseNumber == n){
                    valid = false;
                    System.out.printf(baseNumber + " ");
                    baseNumber--;
                    funRecursive(n, baseNumber, valid);
                }
            }
        }else {

            if(baseNumber > 1){
                System.out.printf(baseNumber + " ");
                baseNumber--;
                funRecursive(n, baseNumber, valid);
            }else{

                System.out.print(baseNumber);
            }
        }

        }
    }

