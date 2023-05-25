package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задание 1. Нахождение треугольного числа и факториала числа.
        Scanner scan = new Scanner(System.in);
//        Triangle_Factorial triangleFactorial = new Triangle_Factorial();
//        System.out.print("Введите число: ");
//        int num = scan.nextInt();
//        System.out.println("Треугольным числом " + num + " является: " + triangleFactorial.getTriangle(num));
//        System.out.println("Факториалом чилса " + num + " является: " + triangleFactorial.getFactorial(num));

        // Задание 2. Нахождение простых чисел от 1 до 1000.
        System.out.println("Введите число, до которого хотите определить все простые числа: ");
        int number = scan.nextInt();
        System.out.println("Простыми числами до числа " + number + " являются: ");

        int i, j;
        boolean check;

        for (i = 2; i < number; i++) {
            check = true;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(i + " ");

            }
        }
    }
}
