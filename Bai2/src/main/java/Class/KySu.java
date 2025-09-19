/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.Scanner;
public class KySu extends CanBo {
    private String nganhDaoTao214;
    public KySu(){
    }
    public KySu(String hoTen214,String ngaySinh214,String gioiTinh214,
            String diaChi214,String nganhDaoTao214){
        super(hoTen214,ngaySinh214,gioiTinh214,diaChi214);
        this.nganhDaoTao214=nganhDaoTao214;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("\tNhap nhanh dao tao: ");
        nganhDaoTao214=sc.nextLine();
    } 
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: "+nganhDaoTao214);
    }
}
