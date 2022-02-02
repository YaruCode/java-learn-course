package com.company;

public class Cat implements Animal {

    @Override
    public void Eat() {
        System.out.println("ca eat");
    }

    @Override
    public void Run() {
        System.out.println("cat run");
    }

    @Override
    public void Shout() {
        System.out.println("cat shout");
    }

    public Color get_color() {
        return _color;
    }

    public void set_color(Color _color) {
        this._color = _color;
    }

    public Color _color;

}
