package org.example;

public class Calc {

    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, result);
        //System.out.println("Сумма " + a + " и " + b +" равна " + result);
        return result;
    }
    public int subtract(int c, int h){
        int result;
        result = c - h;
        System.out.printf("Сумма %d и %d равна %d\n", c, h, result);
        //System.out.println("Сумма " + c + " и " + h + " равна " + result);
        return result;
    }
}
