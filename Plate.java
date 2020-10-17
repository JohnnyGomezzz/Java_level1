package com.company;

public class Plate {
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void decreaseFood(int val)
    {
        this.food -= val;
    }

    public void info()
    {
        System.out.println("В миске " + food + " единиц корма.\n");
    }

    public int getFood()
    {
        return this.food;
    }

    public void increaseFood(Cat dog)
    {
        System.out.println("Добавляем " + (dog.getHunger() - food) + " единиц корма.\n");
        food = dog.getHunger();
        info();
    }

}
