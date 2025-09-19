/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.Scanner;
public class NhanVien extends CanBo {
    private String congViec214;
    public NhanVien(){       
    }
    public NhanVien(String hoTen214,String ngaySinh214,String gioiTinh214,String diaChi214){
        super(hoTen214,ngaySinh214,gioiTinh214,diaChi214);
        this.congViec214=congViec214;
    }
    public void nhapThongTin(Scanner sc){
        super .nhapThongTin(sc);
        System.out.print("\tNhap cong viec: ");
        congViec214=sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tCong viec: "+congViec214);
    }
}


