package com.company;

public class Main
{
	public static void main(String[] args)
	{
		Cat[] catList = new Cat[3];

		catList[0] = new Cat("Дуся", 5, 20);
		catList[1] = new Cat("Мурзик", 10, 25);
		catList[2] = new Cat("Барсик", 8, 30);

        Plate plate = new Plate(47);

		plate.info();

		for(int i = 0; i < catList.length; i++)
		{
			catList[i].eat(plate);
		}
	}
}
