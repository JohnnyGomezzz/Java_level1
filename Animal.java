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

    boolean runLength(int currentRunLength)
    {
        return currentRunLength <= maxRunLength;
    }

    boolean jumpHeight(int currentJumpHeight)
    {
        return currentJumpHeight <= maxJumpHeight;
    }

    boolean swimLength(int currentSwimLength)
    {
        return currentSwimLength <= maxSwimLength;
    }

    void result()
    {
        if (runLength(currentRunLength)) {
            System.out.println(name + " может пробежать " + currentRunLength + " м.");
        }
        else {
            System.out.println(name + " не может пробежать " + currentRunLength + " м.");
        }

        if (jumpHeight(currentJumpHeight)) {
            System.out.println(name + " может перепрыгнуть препятствие в " + currentJumpHeight + " м.");
        }
        else {
            System.out.println(name + " не может перепрыгнуть препятствие в " + currentJumpHeight + " м.");
        }

        if (swimLength(currentSwimLength)) {
            System.out.println(name + " может проплыть " + currentSwimLength + " м.");
        }
        else {
            System.out.println(name + " не может проплыть " + currentSwimLength + " м.");
        }
    }
}