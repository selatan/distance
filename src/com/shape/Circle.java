package com.shape;

/**
 * Created by Administrator on 2016/7/23.
 */
public class Circle extends Shape {
    private float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public void perimeter() {
        double s = 2 * Math.PI * r;
        System.out.println("圆的周长是：" + s);
    }

    @Override
    public void area() {
        double s = Math.PI * r * r;
        System.out.println("圆的面积是：" + s);
    }
}
