package com.company;

/**
 * Created by a1 on 16/7/16.
 */
public class HelloWorld {


    // 定义静态变量score1
    static int score1 = 86;
    // 定义静态变量score2
    static int score2 = 92;

    // 定义静态方法sum，计算成绩总分，并返回总分
    public  static   int sum() {
        int t = score1 + score2;
        return t;

    }

    public static void main(String[] args) {

        // 调用静态方法sum并接收返回值
        int allScore = HelloWorld.sum();

        System.out.println("总分：" + allScore);
    }
}
