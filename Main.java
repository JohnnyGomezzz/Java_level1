package com.JohnnyGomezzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    Dog dog1 = new Dog("Шарик", 400, 50, 10);
        Dog dog2 = new Dog("Бобик", 600, 70, 20);
        Cat cat1 = new Cat("Мурзик", 200, 200);

        run();
        jump();
        swim();

        dog1.result();
        System.out.println();
        dog2.result();
        System.out.println();
        cat1.result();
        System.out.println();
    }

    static void run()
    {
        System.out.println("Введите расстояние, которое животинка должна пробежать:");

        Scanner scanner = new Scanner(System.in);
        Animal.currentRunLength = scanner.nextInt();
    }

    static void jump()
    {
        System.out.println("\nВведите высоту препятствия, которое животинка должна перепрыгнуть:");

        Scanner scanner = new Scanner(System.in);
        Animal.currentJumpHeight = scanner.nextInt();
    }

    static void swim()
    {
        System.out.println("\nВведите расстояние, которое животинка должна проплыть:");

        Scanner scanner = new Scanner(System.in);
        Animal.currentSwimLength = scanner.nextInt();
    }


}
