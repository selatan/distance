package com.company;

/**
 * Created by a1 on 16/7/19.
 */
public class MOuter {
    public void show(){
        final int a = 25 ;//常量
        int b = 13;//变量
        //方法内部类
        class MInner{
            int c = 2 ;//内部类中的变量
            public void print(){
                System.out.println("访问外部类的方法中的常量a:"+a);
                System.out.println("访问内部类中的变量c:"+c);
            }
        }
           MInner mi = new MInner();//创建方法内部类的对象
           mi.print();//调用内部类的方法
    }

    public static void main(String[] args) {
        MOuter mo = new MOuter();//创建外部类的对象
        mo.show();//调用外部类的方法
    }
}
