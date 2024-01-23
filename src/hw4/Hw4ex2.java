package hw4;

import java.util.Scanner;

public class Hw4ex2 {
//    Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет, является она полиндромом или нет. И выводит данную информацию на экран.
    public static void main(String[] args) {
        Scanner scannerR = new Scanner(System.in);
        System.out.println("Введіть число:");
        String number = scannerR.nextLine();
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println("Число " + number + " є паліндромом.");
        } else {
            System.out.println("Число " + number + " не є паліндромом.");
        }
        scannerR.close();
    }

    public static boolean isPalindrome(String number) {
        StringBuilder reversed = new StringBuilder(number).reverse();
        return number.equals(reversed.toString());
    }
}



