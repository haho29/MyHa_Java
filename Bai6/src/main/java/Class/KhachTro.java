/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.Scanner;
public class KhachTro extends Nguoi{
    private int soNgayTro214;
    private String loaiPhong214;
    private double giaPhong214;
    public KhachTro(){
    }
    public KhachTro(String hoTen214,int CMND214,int soNgayTro214,String loaiPhong214,Double giaPhong214 ){
        this.hoTen214=hoTen214;
        this.CMND214=CMND214;
        this.soNgayTro214=soNgayTro214;
        this.loaiPhong214=loaiPhong214;
        this.giaPhong214=giaPhong214;
    }
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap so ngay tro: ");
        soNgayTro214 = sc.nextInt(); 
        sc.nextLine();
        System.out.print("\tNhap loai phong: ");
        loaiPhong214 = sc.nextLine();
        System.out.print("\tNhap gia phong: ");
        giaPhong214 = sc.nextDouble(); 
        sc.nextLine();
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo ngay tro: " + soNgayTro214);
        System.out.println("\tLoai phong: " + loaiPhong214);
        System.out.println("\tGia phong: " + giaPhong214);
    }
    public int getSoNgayTro(){
        return soNgayTro214;
    }
    public Double getGiaPhong(){
        return giaPhong214;
    }
}
