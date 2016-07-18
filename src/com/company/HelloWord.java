package com.company;

/**
 * 循环数组中的元素
 * Created by a1 on 16/7/13.
 */
public class HelloWord {

//    public static void main(String[] args) {
//
//        // 定义一个长度为 3 的字符串数组，并赋值初始值
//        String[] hobbys = {"sports", "game", "movie"};
//        System.out.println("循环输出数组中元素的值：");
//
//        // 使用循环遍历数组中的元素
//
//        for (int i = 0; i < hobbys.length; i++) {
//            System.out.println(hobbys[i]);
//        }
//
//
//    }


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
        int allScore = HelloWord.sum();

        System.out.println("总分：" + allScore);
    }


}



