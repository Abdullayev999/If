package com.company;

public class Main {

    public static void main(String[] args) {

  /*
    1.Написать программу, которая выводит на экран фразу "Мне xx лет", где xx - ваш возраст
    2.Написать программу, которая считает сумму двух чисел и выводит значение суммы на экран
    3.Написать программу, которая для двух чисел выводит результаты следующих операций:
	3.1. Сложение
	3.2. Вычитание
	3.3. Умножение
	3.4. Деление
	3.5. Остаток от деления
	*/

        int a;
        int b;
        int answer;
        float answer_division;
        // or int a , b , answer ; but this is not recommended by the Java Code Conventions.

        // 1
        System.out.println("I am 24 years old");

        //2
         a = 10;
         b = 4;
         answer = a + b;
         System.out.println(a + " + " + b + " = " + answer);
        // or System.out.println(sum);

        //3
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        //3.1
        answer = a+b;
        System.out.println("Amount = " + answer);

        //3.2
        answer = a-b;
        System.out.println("Subtraction = " + answer);

        //3.3
        answer = a*b;
        System.out.println("Multiplication = " + answer);

        //3.4
        answer_division = (float) a/b;
        System.out.println("Division = " + answer_division);

        //3.5
        answer = a%b;
        System.out.println("Remainder of the division = " + answer);
    }
}
