/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;

/**
 *
 * @author Admin
 */
public class ham {

    public static void main(String[] args) {
        ATM bidv, vcb;

        bidv = new ATM("12345", 100000);
        vcb = new ATM("54321", 300000);

        System.out.println(bidv);
        System.out.println(vcb);

        bidv.napTien(10000);
        System.out.println(bidv);

        vcb.chuyentien(bidv, 50000);
        System.out.println(bidv);
        System.out.println(vcb);
    }H
}
