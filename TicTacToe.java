import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static char [][] map;
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    //ячейки поля
    static final char DOT_EMPTY = '•';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args) {

        //1. Инициализация поля
        initMap();

        //2. Вывод поля
        printMap();

        while (true) {

            //3. Выбор игральной фишки
            //4. Ход игрока
            makeHumanTurn();

            //5. Вывод поля
            printMap();

            //6. Проверка рядов и диагоналей
            if (hasWin(DOT_X))
            {
                System.out.println("Победил человек!");
                break;
            }

            //7. Проверка на ничью
                if (isMapFull())
                {
                    System.out.println("Ничья!");
                    break;
                }

            //8. Ход ИИ
            makeAiTurn();

            //9. Вывод поля
            printMap();

            //10. Проверка рядов и диагоналей
            if (hasWin(DOT_O))
            {
                System.out.println("Победил ИИ!");
                break;
            }

            //11. Проверка на ничью
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() //Создаём массив для поля 3х3
    {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() //Печать поля + нумерация столбцов и строк
    {
        for (int i = 0; i <= map.length; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++)
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void makeHumanTurn() //Ход игрока
    {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do
        {
            System.out.println("Введите координаты хода в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) //Проверка хода
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }
        else if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void makeAiTurn() //Ход ИИ
    {
        Random random = new Random();
        int x;
        int y;
        do
        {
            System.out.println("Введите координаты хода в формате X Y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }
        while (!isCellValid(x, y));
        System.out.println("Компьютер сходил в точку: " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    static boolean hasWin(char symb) //Проверка победы
    {

        for (int i = 0; i < map.length; i++) {
            int z = 0;
            int y = 0;
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == symb) z += 1; //Проверка по горизонтали
                if (z == DOTS_TO_WIN) return true;

                if (map[j][i] == symb) y +=1; //Проверка по вертикали
                if (y == DOTS_TO_WIN) return true;
            }
        }
        for (int j = 0; j <= map.length - DOTS_TO_WIN; j++) {
            int z = 0;
            for (int i = 0; i < map.length; i++) {
                if (map[i][j + z] == symb) z += 1; //Проверка по основной диагонали
                if (z == DOTS_TO_WIN) return true;
            }
        }
        for (int j = map.length - 1; j >= map.length - DOTS_TO_WIN; j--) {
            int y = 0;
            for (int i = 0; i < map.length; i++) {
                if (map[i][j - y] == symb) y += 1; //Проверка по побочной диагонали
                if (y == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }

    // Ничья
    static boolean isMapFull()
    {
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if (map[i][j] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
