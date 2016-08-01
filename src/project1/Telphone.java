package project1;

/**
 * Created by a1 on 16/7/20.
 */
public class Telphone {
    private  int screen;
    private int mem;
    private int cpu;


    public static void main(String[] args) {
        Telphone T1 = new Telphone();
        T1.screen = 5;

        Telphone T2 = new Telphone();
        T2.screen=5;
        System.out.println(T1.equals(T2));


    }


}
