package hw4;

import java.util.Scanner;

public class Hw4ex3 {
//    Написать проограмму, условно для склада приема металла. Представим, что склад может хранить определенный вес металла. Пользователь вводит с клавиатуры вес, который может хранится на складе. Дальше пользователь вводит с клавиатуры вес, который условно собирается сдать на склад пользователь. Программа должна после каждой сдачи металла показывать сколько веса еще может принять склад. Если пользователь хочет сдать металла больше чем осталось места на складе, то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции. Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает о невозможности приемки такого малого веса. Программа завершается, когда место на складе закончилось.
public static void main(String[] args) {
    Scanner scannerX = new Scanner(System.in);
    System.out.println("Введіть вагу, яку може зберігати склад (в кілограмах):");
    int capacity = scannerX.nextInt();
    int remaining = capacity;
    boolean isFull = false;
    while (!isFull) {
        System.out.println("Введіть вагу металу, яку хочете здати на склад (в кілограмах):");
        int weight = scannerX.nextInt();
        if (weight < 5) {
            System.out.println("Неможливо прийняти метал вагою менше 5 кг.");
        } else if (weight > remaining) {
            System.out.println("Немає достатньо місця на складі для такої ваги металу.");
        } else {
            remaining -= weight;
            System.out.println("Метал вагою " + weight + " кг успішно прийнято на склад.");
        }
        System.out.println("Залишок ваги, яку може прийняти склад: " + remaining + " кг.");
        if (remaining == 0) {
            isFull = true;
            System.out.println("Склад повністю заповнений.");
        }
    }
    scannerX.close();
}





}
