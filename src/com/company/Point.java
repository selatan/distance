package com.company;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by a1 on 16/5/26.
 */
public class Point {
    float a;
    float b;


    public static void main(String[] agr) {
        Point A = new Point();
        Point B = new Point();
        Point C = new Point();


        double mix =B.calculateDistance(2, 2, 8, 10);
        double p =C.calculateDistance(2, 2, 8, 15);

        System.out.println(mix);

    }

    public double calculateDistance(float a, float b, float x, float y) {

        double m = Math.pow((a - x), 2);
        double n = Math.pow((b - y), 2);
        double s = Math.sqrt(Math.abs(m + n));

        List<Double> list = new ArrayList<>();
        list.add(s);

        int i ;

        for (i = 0; i < list.size()-1; i++) ;
           double mix = list.get(0);
           if(list.get(i) < mix){
              mix = list.get(i);
           }
         return mix;


    }
}
