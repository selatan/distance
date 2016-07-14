package com.company;

/**
 * Created by a1 on 16/7/13.
 */
public class Foreach {
    public static  void main(String[] args){
        int[] scores = {43,88,91,66,50,2};

        System.out.println("使用for循环输出数组中的元素:");
        for(int i = 0;i<scores.length;i++){
            System.out.println(scores[i]);
        }

        System.out.println("使用foreach循环输出数组中的元素:");
        for(int score : scores){
            System.out.println(score);
        }



         //使用循环输出二维数组中的每一个元素
        
        //定义一个三行三列的二维数组并赋值
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};

        //定位行
        for(int i = 0; i<nums.length;i++){
            //定位到行里面的每一个元素
            for(int j = 0 ;j<nums[i].length;j++){
                //依次输出每个元素
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }

    }
}
