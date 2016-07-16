package com.company;

/**
 * Created by a1 on 16/7/16.
 */
public class StaticVar {

//    //static修饰的变量为静态变量(类变量),所有的对象共享这个变量
//    static String hobby = "今天是2016年7月16,星期六";
//
//    public static void main(String[] args) {
//
//        //静态变量可以直接使用类名进行访问,无需创建类的对象
//        System.out.println("通过类名访问hobby:"+StaticVar.hobby);
//
//        //通过创建对象来访问静态变量
//        StaticVar var = new StaticVar();
//        System.out.println("通过对象访问hobby:"+var.hobby);
//
//        //通过对象名的形式修改静态变量的值
//        var.hobby = "我是大坏蛋啊哈哈哈";
//        //再次使用类名访问静态变量,值已被修改
//        System.out.println("通过类名访问hobby:"+StaticVar.hobby);
//    }

    // 定义静态变量，保存班级名称
    static   String className = "JAVA开发一班";

    public static void main(String[] args) {

        // 访问静态变量，输出班级名称
        System.out.println(StaticVar.className);
    }
}
