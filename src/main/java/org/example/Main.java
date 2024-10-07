package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Задача 1:
    Напишите программу, которая будет принимать на вход число из консоли и на выход
    будет выводить сообщение четное число или нет. Для определения четности числа
    используйте операцию получения остатка от деления (операция выглядит так: '% 2'). */
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.print("Task 1\n" +
                "Please enter a number = ");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd");
        }

        /* Задача 2:
    Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold». */
        System.out.print("Task 2\n" +
                "Please enter a temperature = ");
        int enteredTemperature = in.nextInt();

        if (enteredTemperature > -5) {
            System.out.println("Warm");
        } else if (enteredTemperature > -20 && enteredTemperature < -5) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }

       /* Задача 3:
    Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно. for test */
        System.out.print("Task 3\n");
        for (int i = 10; i < 21; i++) {
            System.out.println("Square of a number " + i + " = " + i * i);
        }

        /* Напишите программу, где пользователь вводит любое целое положительное число. А
    программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    ввести некорректные данные. */
        System.out.print("Task 4\n" +
                "Please enter a positive number = ");

        if (in.hasNextInt()) {
            int enteredNumber = in.nextInt();

            if (enteredNumber > 0) {
                int sum = 0;
                for (int i = 1; i <= enteredNumber; i++) {
                    sum += i;
                }
                System.out.println("The sum is " + sum);
            } else {
                System.out.println("Not a positive number is entered. The operation is discarded");
            }
        } else {
            System.out.println("Not an integer number is entered. The operation is discarded");
        }
    }
}