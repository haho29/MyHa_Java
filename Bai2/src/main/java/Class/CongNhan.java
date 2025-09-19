/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.Scanner;
public class CongNhan extends CanBo {
    private String bac214;
    public CongNhan(){
    }
    public CongNhan(String hoTen214,String ngaySinh214,String gioiTinh214,String 
            diaChi214,String nganhDaoTao214){
        super(hoTen214,ngaySinh214,gioiTinh214,diaChi214);
        this.bac214=bac214;
    }
    public void nhapThongTin(Scanner sc){
      super.nhapThongTin(sc);
      System.out.print("\tNhap bac: ");
      bac214=sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tBac: "+bac214);
    }
}
