package com.JohnnyGomezzz;

import javax.swing.*;

public class Human implements Jumping, Running {

    private String name;
    private double jumpHeight;
    private int runLength;

    public Human(String name, double jumpHeight, int runLength)
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
        System.out.println(name + " не добежал и выбывает");
    }

    public void jump()
    {
        System.out.println(name + " перепрыгнул препятствие");
    }

    public void notJump()
    {
        System.out.println(name + " не перепрыгнул и выбывает");
    }

}
