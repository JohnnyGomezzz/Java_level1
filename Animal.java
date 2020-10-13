package com.JohnnyGomezzz;

public abstract class Animal
{
    protected String name;
    protected int maxRunLength;
    protected int maxJumpHeight;
    static int currentRunLength;
    static int currentJumpHeight;
    protected int maxSwimLength;
    static int currentSwimLength;

    Animal(String name, int maxRunLength, int maxJumpHeight)
    {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    boolean runLength()
    {
        return currentRunLength <= maxRunLength;
    }

    boolean jumpHeight()
    {
        return currentJumpHeight <= maxJumpHeight;
    }

    boolean swimLength()
    {
        return currentSwimLength <= maxSwimLength;
    }

    void result()
    {
        if (runLength()) {
            System.out.println(name + " может пробежать " + currentRunLength + " м.");
        }
        else {
            System.out.println(name + " не может пробежать " + currentRunLength + " м.");
        }

        if (jumpHeight()) {
            System.out.println(name + " может перепрыгнуть препятствие в " + currentJumpHeight + " см.");
        }
        else {
            System.out.println(name + " не может перепрыгнуть препятствие в " + currentJumpHeight + " см.");
        }

        if (swimLength()) {
            System.out.println(name + " может проплыть " + currentSwimLength + " м.");
        }
        else {
            System.out.println(name + " не может проплыть " + currentSwimLength + " м.");
        }
    }
}