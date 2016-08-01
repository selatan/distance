package com.friday;

/**
 * 多态
 * Created by a1 on 16/7/20.
 */
public class Initail {

    public static void main(String[] args) {

        Animal obj1 = new Animal(); //父类的引用指向本类对象
        Animal obj2 = new Dog();  //父类的引用指向子类对象
        Animal obj4 = new Cat(); //父类的引用指向子类对象
        //Dog obj3 = new Animal();//子类的引用不能指向父类的对象

        obj1.eat();//本类对象,调用本类的方法
        obj2.eat();//子类对象,调用子类重写过的eat()方法
        obj4.eat();//子类对象,未重写eat)方法,则继承父类的方法
        //obj2.watchDoor();//则是不允许的,父类的引用不能调用子类独有的方法
    }
}
