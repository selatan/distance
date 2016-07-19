package com.company;

/**
 * Created by a1 on 16/7/18.
 */

//外部类Outer
public class Outer {
    private int a = 99; //定义外部类的私有属性

    //定义内部类Inner
    public class  Inner{
        int b = 2; //定义内部类的成员属性
        public void test(){
            System.out.println("访问外部类中的a:"+a);
            System.out.println("访问内部类中的b:"+b);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();//创建外部类对象,对象名为o
        Inner i = o.new Inner();//使用外部类对象创建内部类对象,对象名为i
        i.test();//调用内部内对象的test方法
    }
}
