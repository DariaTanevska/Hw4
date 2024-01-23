package hw4;

import java.util.Scanner;

public class Hw4ex4 {
//    Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”. Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20. Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”. Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов. Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00” Пример2. после ввода 1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”

    public static void main(String[] args) {

        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        Scanner input = new Scanner(System.in);

        System.out.println("Введите три числа от 0 до 6 через пробел:");
        int index1 = input.nextInt();
        int index2 = input.nextInt();
        int index3 = input.nextInt();


        if (index1 >= 0 && index1 < names.length &&
                index2 >= 0 && index2 < times.length &&
                index3 >= 0 && index3 < places.length) {

            String message = names[index1] + " будет идти в " + places[index3] + " в " + times[index2] + ":00";
            System.out.println(message);
        } else {

            System.out.println("Неверный ввод. Индексы должны быть от 0 до 6.");
        }

        input.close();
    }


}