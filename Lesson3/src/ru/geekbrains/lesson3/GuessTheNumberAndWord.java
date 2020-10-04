package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberAndWord {

    public static void main(String[] args) {
        System.out.println("Приветствую, Человек! Я - Хранитель Знаний!");
        System.out.println();
        System.out.println("Чтобы пройти дальше, тебе необходимо отгадать две загадки. На первую " +
                "у тебя будет всего три попытки.");
        System.out.println("Итак, первая загадка: какое число от 0 до 9 я загадал?");

        checkNumber();

        System.out.println("Что ж, первую загадку ты одолел. Приступим ко второй!");
        System.out.println();

        System.out.println("Загадка вторая: в моей кладовой хранятся разные иностранные фруты и овощи: \n" +
                "apple, orange, lemon, banana, apricot, avocado, broccoli, carrot, cherry, garlic, grape, melon, \n" +
                "leak, kiwi, mango, mushroom, nut, olive, pea, peanut, pear, pepper, pineapple, pumpkin и potato.\n" +
                "Какой из них сейчас в чёрном ящике?\n\nТы будешь знать, если угадаешь хотя бы одну букву.");

        checkWord();
    }

    public static int getNumber(int minNum, int maxNum) {
        int num;
        do {
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();

            if (num < minNum || num > maxNum) {
                System.out.println("Это число не от 0 до 9!");
            }
        }
        while (num < minNum || num > maxNum);
        return num;
    }

    public static int getAnswer(int yes, int no) {
        int answer;
        System.out.println("Ты использовал все попытки! Уходи и подготовься лучше, Человек!\n");
        System.out.println("Попробовать ещё раз? 1 - да, 0 - нет.");
        do {
            Scanner scan = new Scanner(System.in);
            answer = scan.nextInt();
            if (answer < no || answer > yes) {
                System.out.println("Неверный ввод, попробуйте ещё раз.");
            }
        }
        while (answer < no || answer > yes);
        return answer;
    }

    public static void checkNumber() {
        Random randNum = new Random();
        int y = randNum.nextInt(10);
        int x;
        int step = 0;
        int a;

        while (step >= 0)
        {
            x = getNumber(0, 9);
            if (x > y) {
                System.out.println("Загаданное число меньше");
                }
            else {
                if (x < y) {
                    System.out.println("Загаданное число больше");
                    }
                else {
                    if (x == y) {
                        System.out.println("Ты угадал, Человек!\n");
                        break;
                        }
                    }
                }
                step++;

                if (step == 3) {
                    a = getAnswer(1, 0);
                    if (a == 0) {
                        System.exit(0);}
                    if (a == 1) {
                        System.out.println("Продолжаем! У тебя ещё 3 попытки.");
                            step = step - 3;}
                        else {
                            System.out.println("Неверный ввод, попробуйте ещё раз.");
                        }
                }
            }
    }

    public static void checkWord()
    {
        final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        int z = rand.nextInt(words.length);
        int n;
        int h;
        int step = 0;

        while (step >= 0) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();

            if (words[z].equals(word)) {
                System.out.println("Ты угадал, Человек! Проходи и черпай столько знаний, сколько сможешь унести!");
                System.exit(0);
            } else {
                if (words[z].length() <= word.length()) {
                    for (n = 0, h = 0; n < words[z].length(); n++, h++) {
                        if (words[z].charAt(n) == word.charAt(h)) {
                            System.out.print(words[z].charAt(n));
                        } else {
                            System.out.print("*");
                        }
                    }
                    for (int i = 1; i <= 15 - words[z].length(); i++) {
                        System.out.print("*");
                    }
                } else {
                    for (n = 0, h = 0; h < word.length(); n++, h++) {
                        if (words[z].charAt(n) == word.charAt(h)) {
                            System.out.print(word.charAt(h));
                        } else {
                            System.out.print("*");
                        }
                    }
                    for (int i = 1; i <= 15 - word.length(); i++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
                System.out.println("Попробуй ещё раз, Человек!");
            }
            step++;
        }
    }


}
