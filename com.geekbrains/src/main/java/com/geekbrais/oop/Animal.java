package com.geekbrais.oop;

public class Animal {       // Animal- это предок, от него создаются все объекты- животные
    String name;
    String color;
    int age;
    String masterName;
    int run;
    int sail;
    public  Animal(){}
    public Animal(String name, String color, int age, String masterNameint, int run, int sail) {
        System.out.println("Создается объект  "+ name);
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
    public void Cat(){
        System.out.println("Кот " + name + "   прекрасно себя чувствует, когда ест"); // не добавляется  + feed
        
    }
    public void Tiger(){
        System.out.println("Тигр " + name + "   прекрасно себя чувствует  ");// вообще не выводится, не добавляется + fото

    }
    public void Cat7(){
        System.out.println("Кот " + name + "   прекрасно себя чувствует, когда ест"); // не добавляется -feed

    }
}







