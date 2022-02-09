package com.company;

public class Dog implements Animal {

    @Override
    public void Eat() {
        System.out.println("Dog eat");

    }

    @Override
    public void Run() {
        System.out.println("dog run");
    }

    @Override
    public void Shout() {
        System.out.println("dog shout");
    }

}
