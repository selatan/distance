package com.company;

/**
 * 找出数组中的最大值、最小值,并计算数组中数字的平均值
 * Created by a1 on 16/7/13.
 */
public class Array {

    public static void main(String[] args) {
        // 定义一个整型数组，并赋初值
        int[] nums = new int[]{61, 23, 4, 74, 13, 148, 20};

        int max = nums[0]; // 假定最大值为数组中的第一个元素
        int min = nums[0]; // 假定最小值为数组中的第一个元素
        double sum = 0;// 累加值
        double avg = 0;// 平均值

        for (int i = 1; i < nums.length; i++) { // 循环遍历数组中的元素
            // 如果当前值大于max，则替换max的值
            if (nums[i] > max)
                max = nums[i];
        }

        // 如果当前值小于min，则替换min的值
        for (int t = 1; t < nums.length; t++) { // 循环遍历数组中的元素
            if (nums[t] < min)
                min = nums[t];
        }

        // 累加求和
        for (int j = 0; j < nums.length; j++) {
            sum = sum + nums[j];

        }

        // 求平均值
        avg = sum / nums.length;

        System.out.println("数组中的最大值：" + max);
        System.out.println("数组中的最小值：" + min);
        System.out.println("数组中的平均值：" + avg);
    }
}


