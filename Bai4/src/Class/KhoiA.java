package Class;
import java.util.Scanner;
public class KhoiA extends ThiSinh {
	private String mon1214;
	private String mon2214;
	private String mon3214;
	public KhoiA() {
	}
	public KhoiA(String mon1214, String mon2214, String mon3214) {
		this.mon1214 = mon1214;
		this.mon2214 = mon2214;
		this.mon3214 = mon3214;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1214 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2214 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3214 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1214 + " - " + mon2214 + " - " + mon3214);
	}
}
