package com.geekbrais.oop;
public class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected String masterName;
    protected int run;
    protected int sail;
    public  Animal(){}
    public Animal(String name, String color, int age, String masterNameint, int run, int sail) {
        this.name = name;
        this.color = color;
        this.age= age;
        this.masterName = masterNameint;
        this.run = run;
        this.sail = sail;
    }
    public void Dog() {
        System.out.println("Собака " + name + "   бежит  " + run + "   метров");
        System.out.println("Собака " + name + "   плывет  " + sail + "   метров");
    }
}







