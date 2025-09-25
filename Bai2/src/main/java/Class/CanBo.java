/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.Scanner;
public class CanBo {
    private String hoTen214;
    private String ngaySinh214;
    private String gioiTinh214;
    private String diaChi214;
    public CanBo(){  
    }
    public CanBo(String hoTen214, String ngaySinh214, String gioiTinh214, String diaChi214){
        this.hoTen214 = hoTen214;
        this.ngaySinh214=ngaySinh214;
        this.gioiTinh214=gioiTinh214;
        this.diaChi214=diaChi214;
    }
    public void nhapThongTin(Scanner sc){
        System.out.println("\tNhap ho ten: ");
        hoTen214=sc.nextLine();
        System.out.println("\tNhap ngay sinh (dd/MM/yy): ");
        ngaySinh214=sc.nextLine();
        System.out.println("\tNhap gioi tinh: ");
        gioiTinh214=sc.nextLine();
        System.out.println("\tNhap dia chi: ");
        diaChi214=sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.printf("\tHo ten: "+hoTen214);
        System.out.printf("\tNgay sinh: "+ngaySinh214);
        System.out.printf("\tGioi tinh: "+gioiTinh214);
        System.out.printf("\tDia chi: "+diaChi214);
    }
    public String getHoTen(){
        return this.hoTen214;
    }
}
