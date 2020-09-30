import java.util.Arrays;

public class Arrs {
    public static void main(String[] args) {

        /*
        Задание 1
        Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0.
         */

        System.out.println("Задание 1");
        invertArr();
        System.out.println();

        /*
        Задание 2
        Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.
         */

        System.out.println("Задание 2");
        addArray();
        System.out.println();

        /*
        Задание 3
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2.
         */

        System.out.println("Задание 3");
        multLess6Array();
        System.out.println();

        /*
        Задание 4
        Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами
         */

        System.out.println("Задание 4");
        makeDiag();
        System.out.println();

        /*
        Задание 5
        ** Задать одномерный массив и найти в нем минимальный
        и максимальный элементы (без помощи интернета)
         */

        System.out.println("Задание 5");
        compObj();
        System.out.println();

        }

    public static void invertArr() // задание 1
    {
        int[] arrZeroOne = {0, 1, 1, 0, 0, 1, 0, 1, 0, 1};

        System.out.println(Arrays.toString(arrZeroOne));

        for (int i = 0; i < arrZeroOne.length; i++)
        {
            if (arrZeroOne[i] == 0)
            {
                arrZeroOne[i] = arrZeroOne[i] + 1;
            } else
                {
                arrZeroOne[i] = arrZeroOne[i] - 1;
                }
        }
        System.out.println(Arrays.toString(arrZeroOne));
    }

    public static void addArray() // задание 2
    {
        int z=0;
        int[] arrAdd3 = new int[8];

        for (int i = 0; i < arrAdd3.length; i++)
        {
            arrAdd3[i] = z;
            z = z+3;
        }
        System.out.println(Arrays.toString(arrAdd3));
    }

    public static void multLess6Array() // задание 3
    {
        int[] arrMult2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(arrMult2));

        for(int i = 0; i<arrMult2.length; i++)
        {
            if (arrMult2[i] < 6)
            {
                arrMult2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrMult2));
    }

    public static void makeDiag() // задание 4
    {
        int[][] arrDiag = new int[10][10];

        for(int i = 0; i < arrDiag.length; i++)
        {
            for(int j = 0; j < arrDiag.length; j++)
            {
                if(i == j) arrDiag[i][j] = 1; // диагональ лев.верх-прав.низ

                if(j == arrDiag.length - 1 - i) arrDiag[i][j] = 1; // диагональ лев.низ-прав.верх

                System.out.print(arrDiag[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void compObj()
    {

    }

}
