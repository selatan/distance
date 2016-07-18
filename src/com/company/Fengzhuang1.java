package com.company;

/**
 * Created by a1 on 16/7/18.
 */
public class Fengzhuang1 {
    private float screen;//封装步骤1:修改属性的可见性
    float cpu;
    float mem;

    //封装步骤2:创建getter/setter方法,用于属性的读写
    public float getScreen(){
        return screen;
    }
    public  void setScreen(float newScreen){
        screen = newScreen;
    }
}
