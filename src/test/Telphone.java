package test;

/**
 * Created by a1 on 16/7/20.
 */
public class Telphone {
    int screen;
    int mem;
    int cpu;

    public static void main(String[] args) {
        Telphone T1 = new Telphone();
        T1.screen = 5;

        Telphone T2 = new Telphone();
        T2.screen=5;
        System.out.println(T1.equals(T2));
    }
}
