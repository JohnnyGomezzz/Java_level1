package ru.geekbrains.lesson1;

public class Lesson1 {
    public static void main (String[] args) //задание 1
    {
        byte myByte = 120; //задание 2
        short myShort = 12001;
        int myInt = 120012;
        long myLong = 1200123;

        char myChar = 'z';

        boolean myBoolean = true;

        float myFloat = 132.57f;
        double myDouble = 4589.4536232;

        String myString = "Привет!";

        System.out.println("3. " + otvet(2, -8, 10, 5));
        System.out.println("4. " + predel(13,8));
        System.out.println("5. Число " + chislo(18," положительное", " отрицательное"));
        System.out.println("6. " + otrCh(-7));
        System.out.println("7. Привет," + strHello("Паша") + "!");
        System.out.println("8. Год " + year(1900, " високосный", " не високосный"));
    }

    static int otvet(int a, int b, int c, int d) //задание 3
    {
        return a*(b+(c/d));
    }

    static boolean predel(int e, int f) //задание 4
    {
        return e + f >= 10 && e + f <= 20;
    }

    static String chislo(int ch, String pol, String otr) //задание 5
    {
        if (ch >= 0) {
            return ch + pol;
        }
        else {
            return ch + otr;
        }
    }

    static boolean otrCh (int g) //задание 6
    {
        return g<0;
    }

    static String strHello (String name) //задание 7
    {
        return name;
    }

    static String year (int y, String vis, String novis) //задание 8
    {
        if (y%400 ==0){
            return y + vis;
        }
        else if (y%100==0){
            return y + novis;
        }
        else if (y%4==0){
            return y + vis;
        }
        else{
            return y + novis;
        }
    }
}
