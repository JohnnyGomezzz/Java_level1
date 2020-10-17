package com.company;

public class Cat {
    private String name;
    private int appetite;
    private int hunger;

    public Cat(String name, int appetite, int hunger)
    {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }

    public void decreaseHunger(int val) //уменьшаем голод
    {
        hunger -= val;
    }

    public void meow()
    {
        System.out.println(name + " просит добавить еды в миску. Для полного счастья ему нужно " + hunger +
                " единиц корма.\n");
    }

    public boolean isHungry()
    {
        return hunger != 0;
    }

    public void eat(Plate plate) //есть из миски
    {
        while (plate.getFood() >= hunger && plate.getFood() > 0)

        {
            System.out.println(name + " кушает\n");

            plate.decreaseFood(appetite); //уменьшаем кол-во корма на кол-во аппетита

            decreaseHunger(appetite); //уменьшается голод

            if (hunger < appetite) //выводим полную сытость "в ноль"
            {
                appetite = hunger;
            }

            if (!isHungry())
            {
                System.out.println(name + " полностью сыт(а).\nВ миске осталось " + plate.getFood() + " единиц корма.\n");
                break;
            }

        }

        if (plate.getFood() < hunger)
        {
            meow();

            plate.increaseFood(this);

            eat(plate);

        }

    }

    public int getHunger()
    {
        return this.hunger;
    }
}
