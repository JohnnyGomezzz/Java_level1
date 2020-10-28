package com.JohnnyGomezzz;

public class Cat implements Jumping, Running{

    private String name;
    private double jumpHeight;
    private int runLength;

    public Cat(String name, double jumpHeight, int runLength)
    {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    public double getJumpHeight()
    {
        return jumpHeight;
    }

    public int getRunLength()
    {
        return runLength;
    }

    public void run()
    {
        System.out.println(name + " пробежал дистанцию");
    }

    public void notRun()
    {
        System.out.println(name + " не добежал и ушёл в закат");
    }

    public void jump()
    {
        System.out.println(name + " перепрыгнул препятствие");
    }

    public void notJump()
    {
        System.out.println(name + " не стал прыгать, а просто ушёл");
    }
}
