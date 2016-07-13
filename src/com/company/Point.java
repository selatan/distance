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
        Point D = new Point();
        Point E = new Point();
        Point F = new Point();
        Point G = new Point();
        Point H = new Point();
        Point I = new Point();
        Point J = new Point();

        double p1 = B.calculateDistance(2, 2, 8, 10);
        double p2 = C.calculateDistance(2, 2, 8, 15);
        double p3 = D.calculateDistance(2, 2, 14, 16);
        double p4 = F.calculateDistance(2, 2, 14, 19);
        double p5 = G.calculateDistance(2, 2, 8, 9);
        double p6 = H.calculateDistance(2, 2, 4, 6);
        double p7 = I.calculateDistance(2, 2, 2, 6);


        List<Double> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);

        int i;
        for (i = 0; i < list.size() - 1; i++) {
            double mix = list.get(0);
            if (list.get(i) < mix)
                mix = list.get(i);

            System.out.println(mix);

        }
    }
    public double calculateDistance(float a, float b, float x, float y) {

        double m = Math.pow((a - x), 2);
        double n = Math.pow((b - y), 2);
        double s = Math.sqrt(Math.abs(m + n));
        return s;
    }
}
