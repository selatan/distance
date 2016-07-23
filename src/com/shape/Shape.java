package com.shape;

/**
 * 现有Shape图形类，用Rectangle矩形和Circle圆形子类，求图形的周长和面积
 *
 * @author huanglj
 * @since 2016/7/23
 */
public abstract class Shape {

    public abstract void perimeter();

    public abstract void area();

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(23.f, 24.f);
        rectangle.area();
        rectangle.perimeter();

        Shape circle = new Circle(23.f);
        circle.perimeter();
        circle.area();
    }
}

