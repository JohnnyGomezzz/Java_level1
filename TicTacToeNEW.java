import java.util.Random;
import java.util.Scanner;

public class TicTacToeNEW
{
    static char [][] map;
    static int size;
    static int dots_to_win;
    static int playerDot;

    //ячейки поля
    static final char DOT_EMPTY = '•';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args)
    {
        //Приветствие и правила
        welcome();

        //1.1. Запрос размера поля
        setMapSize();

        //1.2. Запрос количества фишек для победы
        setDotsToWin();

        //1.3. Инициализация поля

        initMap();

        //2. Выбор игральной фишки (Х или О)
        setPlayerDot();

        //3. Вывод поля
        printMap();

        while (true) {
            //4. Ход игрока 1
            player1Turn();

            //5. Вывод поля
            printMap();

            //6. Проверка рядов и диагоналей
            if (hasWin(DOT_X))
            {
                System.out.println("Победил игрок 1!");
                break;
            }

            //7. Проверка на ничью
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }

            //8. Блокировка?


            //9. Ход игрока 2
            player2Turn();

            //10. Вывод поля
            printMap();

            //11. Проверка рядов и диагоналей
            if (hasWin(DOT_O))
            {
                System.out.println("Победил игрок 2!");
                break;
            }

            //12. Проверка на ничью
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }
        }
    }
    public static void welcome()
    {
        System.out.println("Добро пожаловать в игру \"Крестики-нолики\"!\n" +
                "Поле - классическое, квадратное. Размер - на ваш выбор.\n" +
                "Очерёдность хода зависит от выбранной фишки.\n");
    }

    public static void setMapSize() //Запрос размера поля
    {
        System.out.println("Введите размер поля");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
    }

    public static void setDotsToWin() //Запрос количества фишек для победы
    {
        System.out.println("Введите количество фишек для победы. Меньше, чем размер поля, ну понятно да? ;)");
        Scanner scan = new Scanner(System.in);
        dots_to_win = scan.nextInt();
    }

    public static void setPlayerDot()
    {
        System.out.println("Выберите фишку, за которую будете играть: Х - 1, О - 2. Крестик всегда ходит первый.");
        Scanner scan = new Scanner(System.in);
        playerDot = scan.nextInt();
        System.out.println("Вы - игрок " + playerDot + "\n");
    }

    public static void initMap() //Создаём массив для поля
    {
        map = new char[size][size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
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

    public static void player1Turn() //Ход игрока 1
    {
        int x;
        int y;
        if (playerDot == 1) {
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Введите координаты хода в формате X Y");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            }
            while (!isCellValid(x, y));
            System.out.println("Игрок 1 сходил в точку: " + (x + 1) + " " + (y + 1) + "\n");
            map[y][x] = DOT_X;
        }
        else if (map[y][x])
        else
        {
            Random random = new Random();
            //int x;
            //int y;
            do
            {
                x = random.nextInt(size);
                y = random.nextInt(size);
            }
            while (!isCellValid(x, y));
            System.out.println("Игрок 1 сходил в точку: " + (x + 1) + " " + (y + 1) + "\n");
            map[y][x] = DOT_X;
        }
    }

    public static void player2Turn() //Ход игрока
    {
        if (playerDot == 2) {
            Scanner scanner = new Scanner(System.in);
            int x;
            int y;
            do {
                System.out.println("Введите координаты хода в формате X Y");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            }
            while (!isCellValid(x, y));
            System.out.println("Игрок 2 сходил в точку: " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }
        else
        {
            Random random = new Random();
            int x;
            int y;
            do
            {
                x = random.nextInt(size);
                y = random.nextInt(size);
            }
            while (!isCellValid(x, y));
            System.out.println("Игрок 2 сходил в точку: " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }
    }

    public static boolean isCellValid(int x, int y) //Проверка хода
    {
        if (x < 0 || x >= size || y < 0 || y >= size)
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

    static boolean hasWin(char symb) //Проверка победы
    {

        for (int i = 0; i < map.length; i++) {
            int z = 0;
            int y = 0;
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == symb) z += 1; //Проверка по горизонтали
                if (z == dots_to_win) return true;

                if (map[j][i] == symb) y +=1; //Проверка по вертикали
                if (y == dots_to_win) return true;
            }
        }
        for (int j = 0; j <= map.length - dots_to_win; j++) {
            int z = 0;
            for (char[] chars : map) {
                if (chars[j + z] == symb) z += 1; //Проверка по основной диагонали
                if (z == dots_to_win) return true;
            }
        }
        for (int j = map.length - 1; j >= map.length - dots_to_win; j--) {
            int y = 0;
            for (int i = 0; i < map.length; i++) {
                if (map[i][j - y] == symb) y += 1; //Проверка по побочной диагонали
                if (y == dots_to_win) return true;
            }
        }
        return false;
    }

    //static void block()
    //{
        //for (int i = 0; i < map.length; i++)
        //{
        //    for (int j = 0; j < map.length; j++)
        //    {
        //
        //    }
        //}
        //if (map[x][y])
    //}

    static boolean isMapFull() //Проверка на ничью
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
