/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongtrinhbac2;

/**
 *
 * @author Admin
 */
public class PhuongTrinhBac2 {

    private float a;
    private float b;
    private float c;

    public PhuongTrinhBac2() {
        a = 1;
        b = 1;
        c = 1;
    }

    public PhuongTrinhBac2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public String giaiPT() {
        float delta = b * b - 4 * a * c;
        String kq = "";

        if (delta < 0) {
            kq = "VN";
        } else if (delta == 0) {
            kq = "Nghiem kep: x = " + (-b / (2 * a));
        } else {
            float x1, x2;
            kq = "x1 = , x2 = ";
        }
        return kq;
    }

    public static void main(String args[]) {
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2(1, 2, 1);
        System.out.println(ptb2.giaiPT());
    }
}
