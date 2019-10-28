/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;

/**
 *
 * @author Admin
 */
import java.util.Date;
import java.time.Month;

public class QUANLINHANVIEN {

    private String hoTen;
    private Date ngaysinh;
    private String chucvu;
    private int hesoluong;
    private double luongcoban;
    private int hesophucap;
    private int baohiemxahoi;
    private int baohiemthatnghiep;

    public QUANLINHANVIEN(String ht, Date ns, String cv, int hsl, double lcb, int hspc, int bhxh, int bhtn) {
        hoTen = ht;
        ngaysinh = ns;
        chucvu = cv;
        hesoluong = hsl;
        luongcoban = lcb;
        hesophucap = hspc;
        baohiemxahoi = bhxh;
        baohiemthatnghiep = bhtn;
    }

    public double tinhLuong() {
        return (hesoluong + hesophucap) * luongcoban;
    }

    public double baohiemxahoi() {
        return 0.6 * luongcoban;
    }

    public double baohiemthatnghiep() {
        return 0.1 * luongcoban;
    }

    public double tienconnhan() {
        return luongcoban - (baohiemxahoi + baohiemthatnghiep);
    }

    public void hienThi() {
        System.out.println("ten:" + hoTen);
        System.out.println("tuoi: " + ngaysinh);
        System.out.println("chucvu: " + chucvu);
        System.out.println("hesoluong: " + hesoluong);
        System.out.println("luongcoban: " + luongcoban);
        System.out.println("hesophucap: " + hesophucap);
        System.out.println("baohiemxahoi: " + baohiemxahoi);
        System.out.println("baohiemthatnghiep: " + baohiemthatnghiep);
    }

    public static void main(String args[]) {
        QUANLINHANVIEN QLNV = new QUANLINHANVIEN("thienkhung",null, "sv", 13, 43, 23, 43, 34);
        QLNV.hienThi();

    }
}
