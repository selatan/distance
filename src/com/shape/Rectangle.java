package com.shape;

/**
 * Created by Administrator on 2016/7/23.
 */
public class Rectangle extends Shape {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void perimeter() {
        float p = 2 * (a + b);
        System.out.println("长方形的周长是：" + p);
    }

    @Override
    public void area() {
        float r = a * b;
        System.out.println("长方形的面积是：" + r);

    }
}