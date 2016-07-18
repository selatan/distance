package com.company;

/**
 * Created by a1 on 16/7/16.
 */
public class HelloWorld {
    int num1; //声明变量num1
    int num2; //声明变量num2
    static int num3;//声明静态变量num3
    public HelloWorld(){
        num1 = 91 ;
        System.out.println("通过构造方法为变量num1赋值");
    }
    {//初始化块
        num2  =  74 ;
        System.out.println("通过初始化块为变量num2赋值");
    }
    static {//静态初始化块
        num3 = 83 ;
        System.out.println("通过静态初始化块为静态变量num3赋值");
    }

    public static void main(String[] args) {
        HelloWorld hello1 = new HelloWorld();  //创建类的对象hello1
        System.out.println("num1:"+hello1.num1);
        System.out.println("num2:"+hello1.num2);
        System.out.println("num3:"+hello1.num3);
        System.out.println("以上代码执行完成");

        HelloWorld hello2 = new HelloWorld();  //创建类的对象hello2
    }
    //通过输出结果可以看到，程序运行时静态初始化块最先被执行，然后执行普通的初始化块，最后才执行构造方法。由于静态初始化块只在类加载
    // 时执行一次，所以当再次创建对象hello2时并未执行静态初始化块。
}
