package hw4;

import java.util.Scanner;

public class Hw4 {
//Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова, и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP. Все слова введенные до этого должны отобразится в консоли одним предложением.
    public static boolean main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();
        String word;
        System.out.println("Введите слова с клавиатуры. Для завершения введите STOP.");
        do {
            word = scanner.next();
            if (!word.equals("STOP")) {
                sentence.append(word).append(" ");
            }
        } while (!word.equals("STOP"));
        System.out.println("Ваше предложение: " + sentence);
        return false;
    }
}

