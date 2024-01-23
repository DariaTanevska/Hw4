package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Hw4ex5 {
//    Есть одномерный массив из 10 элементов, заполнен- ный случайными числами. Пользователь вводит с клавиатуры число. Программа показывает есть ли такое число в созданном до этого массиве.

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Масив: " + Arrays.toString(array));

        Scanner exscanner = new Scanner(System.in);

        System.out.println("Введіть число:");
        int number = exscanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число " + number + " є в масиві.");
        } else {
            System.out.println("Число " + number + " не є в масиві.");
        }

        exscanner.close();
    }




}
