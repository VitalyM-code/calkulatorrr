package com.vitalijsm;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.println("Ievadi pirmo ciparu un nospied Enter: ");
            int num1 = input.nextInt();
            System.out.println("Ievadi otro ciparu un nospied Enter: ");
            int num2 = input.nextInt();
            System.out.println("Ievadi vēlamo opēraciju(+,-,/,*): ");
            String operation = input.next();
            if (operation.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (operation.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (operation.equals("/")) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else if (operation.equals("*")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            } else {
                System.out.println ("ERROR 404! Mēģini vēlreiz!");
                System.out.println ("Ievadi pirmo ciparu un nospied Enter: ");
                num1 = input.nextInt();
                System.out.println("Ievadi otro ciparu un nospied Enter: ");
                num2 = input.nextInt();
                System.out.println("Ievadi vēlamo opēraciju(+,-,/,*): ");
                operation = input.next();
            }
        }
    }

