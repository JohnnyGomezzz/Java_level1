package com.JohnnyGomezzz;

public class Dog extends Animal
{
    Dog(String name, int maxRunLength, int maxJumpHeight, int maxSwimLength)
    {
        super(name, maxRunLength, maxJumpHeight);
        this.maxSwimLength = maxSwimLength;
    }
}
