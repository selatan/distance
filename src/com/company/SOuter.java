package com.company;

/**
 * Created by a1 on 16/7/19.
 */

//静态内部类
public class SOuter {
    private int a = 50;//外部类的私有变量
    static int b = 1; //外部类的静态变量

    //静态内部类
    public static class SInner{
        int b = 3 ;//内部类的变量
        public void test(){
            System.out.println("访问外部类中的b:"+SOuter.b);
            System.out.println("访问内部类中的b:"+b);
        }
    }
    //测试静态内部类
    public static void main(String[] args) {
        SInner s1 = new SInner();  //直接创建内部类的对象
        s1.test(); //调用test方法
           }
}
