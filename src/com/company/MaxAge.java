package com.company;

import java.util.Arrays;

/**
 * Created by a1 on 16/7/14.
 */
public class MaxAge {

    //完成 main 方法
    public static void main(String[] args) {

        // 创建对象，对象名为hello
        MaxAge hello = new MaxAge();

        // 调用方法并将返回值保存在变量中
        int maxScore = hello.getMaxAge();

        // 输出最大年龄
        System.out.println("最大年龄为：" + maxScore);
    }

    /*
     * 功能：输出学生年龄的最大值
     * 定义一个无参的方法，返回值为年龄的最大值
     * 参考步骤：
     * 1、定义一个整形数组 ages ，保存学生年龄，数组元素依次为 18 ,23 ,21 ,19 ,25 ,29 ,17
     * 2、定义一个整形变量 max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大值
     * 3、使用 for 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大值
     * 4、使用 return 返回最大值
     */
    public int getMaxAge() {
        int[] ages={18,23,21,19,25,29,17};
        Arrays.sort(ages);
        return ages[ages.length-1];


    }
}
