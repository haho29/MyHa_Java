/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.Scanner;
public class PhanSo {
    private int tuSo214;
    private int mauSo214;
    
    public PhanSo(){
        tuSo214 = 0;
        mauSo214 = 1;
    }
    public PhanSo(int tuSo214,int mauSo214){
        this.tuSo214 = tuSo214;
        this.mauSo214 = mauSo214;
    }
    public void NhapPS(Scanner sc){
        int a214;
        int b214;
        do{
            System.out.println("\nNhap vao tu so: ");
            a214 = sc.nextInt();
            System.out.println("\nNhap vao mau so: ");
            b214 = sc.nextInt();
            if(b214 == 0){
                System.out.println("\nLoi! Mau so khong duoc bang 0.Nhap lai!");
            }else{
                tuSo214 = a214;
                mauSo214 =b214;
            }
        }
        while(b214 == 0);
    }
       public void Xuat(){
        if(tuSo214 * mauSo214 < 0){
            System.out.println("\t-" +Math.abs(tuSo214) + "/" +Math.abs(mauSo214));
        }else{
            System.out.println("\t"+Math.abs(tuSo214) + "/" +Math.abs(mauSo214));
        }
       }
       public PhanSo CongPS(PhanSo ps2){
           int a214 = tuSo214*ps2.mauSo214 + ps2.tuSo214*mauSo214;
           int b214 = mauSo214 * ps2.mauSo214;
           return new PhanSo(a214,b214);
       }
       public PhanSo NhanPS(PhanSo ps2){
           int a214 = tuSo214*ps2.tuSo214;
           int b214 = mauSo214*ps2.mauSo214;
           return new PhanSo(a214,b214);
       }
       public PhanSo ChiaPS(PhanSo ps2){
           int a333 = tuSo214*ps2.mauSo214;
           int b333 = mauSo214*ps2.tuSo214;
           return new PhanSo(a333,b333);
       }
       private int timUSCLN(int a214 , int b214){
           int r214 = a214%b214;
           while(r214!=0){
               a214=b214;
               b214=r214;
               r214=a214%b214;
           }
           return b214;
       }
       public boolean kiemTraToiGian(){
           if(timUSCLN(tuSo214,mauSo214) == 1){
               return true;
           }
           return false;
       }
       public void toiGianPS(){
           int x214 = timUSCLN(tuSo214,mauSo214);
           
           tuSo214/=x214;
           mauSo214/=x214;
       }
    }

