package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задание 1. Нахождение треугольного числа и факториала числа.
        Scanner scan = new Scanner(System.in);
        Triangle_Factorial triangleFactorial = new Triangle_Factorial();
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        System.out.println("Треугольным числом " + num + " является: " + triangleFactorial.getTriangle(num));
        System.out.println("Факториалом чилса " + num + " является: " + triangleFactorial.getFactorial(num));

        //----------------------------------------------------------------------------------------

        // Задание 2. Нахождение простых чисел от 1 до 1000.
        System.out.println("Введите число, до которого хотите определить все простые числа: ");
        int number = scan.nextInt();
        System.out.println("Простыми числами до числа " + number + " являются: ");

        SimpleNumbers simNum = new SimpleNumbers();
        System.out.println(simNum.simpleNum(number));
        
        // UPD. Все получилось.

        //----------------------------------------------------------------------------------------

        // Задание 3. Реализовать простой калькулятор
        System.out.println("Введите первое число: ");
        double first = scan.nextDouble();
        System.out.println("Введите оператор (+, -, *, /) : ");
        char operator = scan.next().charAt(0);
        System.out.println("Введите второе число: ");
        double second = scan.nextDouble();

        Calculator calc = new Calculator();

        double result = calc.Calculate(first, operator, second);

    }
}
