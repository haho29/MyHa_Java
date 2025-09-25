/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class KhachSan {
    private ArrayList<KhachTro> ds214;
    public KhachSan() {
        ds214 = new ArrayList<KhachTro>(10);
    }
    public void themKhachTro(KhachTro kt) {
        ds214.add(kt);
    }
public void nhapDanhSach(Scanner sc) {
    KhachTro khach;
    System.out.print("Nhap vao so luong khach: ");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("Nhap vao thong tin khach tro:");
    for (int i = 0; i < n; i++) {
        System.out.println("Khach tro thu " + (i + 1) + " la:");
        khach = new KhachTro();
        khach.nhapThongTin(sc);
        themKhachTro(khach);
    }
}
public void hienThiDanhSach() {
    for (KhachTro khach : ds214) {
        khach.hienThiThongTin();
    }
}
public double tinhTien(int CMND214) {
    double tien = 0;
    for (KhachTro khach : ds214) {
        if (khach.getCMND214() == CMND214) {
            tien = khach.getSoNgayTro() * khach.getGiaPhong();
        }
    }
    return tien;
}
}

