package com.company;

import java.util.Arrays;

/**
 * Created by a1 on 16/7/13.
 */
public class Sort {
    public static void main(String[] args){
        // 定义一个字符串数组
        String[] hobbys = { "sports", "game", "movie" };

        // 使用Arrays类的sort()方法对数组进行排序
        Arrays.sort(hobbys);

        // 使用Arrays类的toString()方法将数组转换为字符串并输出
        System.out.println("转换为字符串输出是:"+Arrays.toString(hobbys)            );
    }
}
