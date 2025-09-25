/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
    protected String hoTen214;
    protected Date ngSinh214;
    protected int CMND214;
    public Nguoi(){
    }
    public Nguoi( String hoTen214,Date ngSinh214,int CMND214 ){
        this.hoTen214=hoTen214;
        this.ngSinh214=ngSinh214;
        this.CMND214=CMND214;
    }
    public void nhapThongTin(Scanner sc)       {
        System.out.print("\t Nhap ho ten:");  
        hoTen214=sc.nextLine();
        System.out.print("\t Nhap ngay sinh:");
        String strDate=sc.nextLine();
        ngSinh214=strToDate(strDate);
        System.out.print("\t Nhap CMND:");
        CMND214=sc.nextInt();
    }   
    private Date strToDate(String strDate){
        Date date= null;
        SimpleDateFormat spf= new SimpleDateFormat("dd-MM-yyyy");
        try{
            date=spf.parse(strDate);
        } catch (ParseException e){
            System.out.println("Loi dinh dang ngay thang!!");
        }
        return date;
    }
    public void hienThiThongTin() {
    System.out.println("\tHo ten: " + hoTen214);
    System.out.println("\tNgay sinh: " + ngSinh214);
    System.out.println("\tHo ten: " + hoTen214);
    }   
    public int getCMND214(){
        return CMND214;
    }
}
