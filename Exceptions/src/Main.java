import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws LengthException {
        System.out.println("Введите ваш текст: ");
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();

        String[] words = userText.split(" ");
        for (int i = 0; i < words.length; i++){
            try {
                new TextReader(words[i]);
            } catch (LengthException e){
                System.out.println("Ошибка ввода!!! Некорректное слово: " + words[i] +
                        " Длина не должна быть больше 10 букв!!!");
            }
        }
    }
}