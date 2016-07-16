package com.company;

import java.util.Arrays;

/**
 * Created by a1 on 16/7/14.
 */
public class Third {

    //完成 main 方法
    public static void main(String[] args) {

        int[] scores ={89,-23,64,91,119,52,73};
        Third hello = new Third();
        hello.printB(scores);
        hello.printA(scores);
    }

    //定义方法完成成绩排序并输出前三名的功能

    public void  printA(int[] scores){

        for(int i=0;i<scores.length;i++){
            if(scores[i]>100||scores[i]<0)
                scores[i] =0;
        }
        Arrays.sort(scores);
        System.out.println("考试成绩前三名为:"+ scores[scores.length-1]+","+scores[scores.length-2]+","+scores[scores.length-3]);

    }

    public void printB(int[] scores){
        Arrays.sort(scores);
        System.out.println("成绩排名为:"+Arrays.toString(scores));
    }


}
