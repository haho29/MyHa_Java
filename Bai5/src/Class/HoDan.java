package Class;
import java.util.Date;
import java.util.Scanner;
public class HoDan extends Nguoi {
	private int soNguoi214;
	private int soNha214;
	private Nguoi[] list; 
	public HoDan() {
		list = new Nguoi[10];
	}
	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi214, int soNha214) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi214 = soNguoi214;
		this.soNha214 = soNha214;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi214 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha214 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi214; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i] = new Nguoi();
			list[i].nhapThongTin(sc);
		}
	}
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi214);
		System.out.println("\tSo nha: " + soNha214);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi214; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i].hienThiThongTin();
		}
	}
	public Nguoi[] getList() {
		return list;
	}
	public int getSoNguoi() {
		return soNguoi214;
	}
}
