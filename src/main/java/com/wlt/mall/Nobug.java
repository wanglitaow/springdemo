package com.wlt.mall;

public class Nobug {

    @TestAnnotation
    public void suanShu() {
        System.out.println("1234567890");
    }

    @TestAnnotation
    public void jiafa() {
        System.out.println("1+1=" + 1 + 1);
    }

    @TestAnnotation
    public void jiefa() {
        System.out.println("1-1=" + (1 - 1));
    }

    @TestAnnotation
    public void chufa() {
        System.out.println("6 / 0=" + 6 / 0);
    }
}
