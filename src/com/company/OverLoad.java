package com.company;

import java.util.Arrays;

/**
 * Created by a1 on 16/7/14.
 */
public class OverLoad {
    public static void main(String[] args) {



//        // 创建对象
//        OverLoad hello = new OverLoad();
//
//        // 调用无参的方法
//        hello.print();
//
//        // 调用带有一个字符串参数的方法
//        hello.print("abc");
//
//        // 调用带有一个整型参数的方法
//        hello.print(20);
//    }
//
//    public void print() {
//        System.out.println("无参的print方法");
//    }
//
//    public void print(String name) {
//        System.out.println("带有一个字符串参数的print方法，参数值为：" + name);
//    }
//
//    public void print(int age) {
//        System.out.println("带有一个整型参数的print方法，参数值为：" + age);




        // 创建对象，对象名为hello
        OverLoad hello = new OverLoad();

        // 调用方法并将返回值保存在变量中
        int[] nums = hello.getArray(8);

          // 将数组转换为字符串并输出
        System.out.println(Arrays.toString(nums));
    }

    /*
     * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
     * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
     */
    public int[] getArray(int length) {
        // 定义指定长度的整型数组
        int[] nums = new int[length];

        // 循环遍历数组赋值
        for ( int i=0;i<nums.length-1;i++ ) {

            // 产生一个100以内的随机数，并赋值给数组的每个成员
            nums[i]=(int) (Math.random()*100);

        }
        return nums; // 返回赋值后的数组









    }
}
