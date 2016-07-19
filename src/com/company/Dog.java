package com.company;

/**
 * Created by a1 on 16/7/19.
 */
public class Dog extends Animal {
    int age = 25;

    //子类将父类的eat方法重写
    public void eat(){
        System.out.println("狗狗具有啃骨头的能力");
        System.out.println("调用父类的age属性:"+super.age);
        System.out.println("调用子类的age属性:"+age);
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.method();

    }
    public  void method(){
        super.eat();
    }
}
