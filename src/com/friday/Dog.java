package com.friday;

/**
 * Created by a1 on 16/7/20.
 */
public class Dog extends Animal {

    //重写父类的eat()方法
    public void eat(){
        System.out.println("狗具有啃骨头的能力");
    }

    //子类独有的方法,不是从父类继承来的
    public  void watchDoor(){
        System.out.println("狗狗有看家的本领");
    }

}
