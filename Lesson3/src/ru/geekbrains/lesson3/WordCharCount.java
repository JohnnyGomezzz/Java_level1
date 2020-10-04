package ru.geekbrains.lesson3;

import java.util.Scanner;

public class WordCharCount {

   // public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            String word1 = scan.nextLine();
            System.out.println(word1);

            int n;
            int z;
            int step = 1;

            while (step > 0) {
                String word2 = scan.nextLine();
                System.out.println(word2);

                if (word1.equals(word2)) {
                    System.out.println("Ура");
                    break;
                } else {
                    if (word1.length() <= word2.length()) {
                        for (n = 0, z = 0; n < word1.length(); n++, z++) {
                            if (word1.charAt(n) == word2.charAt(z)) {
                                System.out.print(word1.charAt(n));
                            } else {
                                System.out.print("*");
                            }
                        }
                        for (int i = 1; i <= 15 - word1.length(); i++) {
                            System.out.print("*");
                        }
                    } else {
                        for (n = 0, z = 0; z < word2.length(); n++, z++) {
                            if (word1.charAt(n) == word2.charAt(z)) {
                                System.out.print(word2.charAt(z));
                            } else {
                                System.out.print("*");
                            }
                        }
                        for (int i = 1; i <= 15 - word2.length(); i++) {
                            System.out.print("*");
                        }
                    }
                }
                step++;
            }
        System.out.println("Ещё раз? 1 - да, 0 - нет.");
            Scanner scan1 = new Scanner(System.in);
            int yesNo = scan1.nextInt();
            if (yesNo == 0) return;
            System.out.println("Продолжаем!");
        }
    }
}
