package Class;
import java.util.Scanner;
public class CBGV extends Nguoi {
	private double luongCung214;
	private double thuong214;
	private double phat214;
	private double luongThucLinh214;
	public CBGV() {
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap luong cung: ");
		luongCung214 = sc.nextDouble();
		sc.nextLine();
		System.out.print("\tNhap thuong: ");
		thuong214 = sc.nextDouble();
		sc.nextLine();
		System.out.print("\tNhap phat: ");
		phat214 = sc.nextDouble();
		sc.nextLine();
		luongThucLinh214 = luongCung214 + thuong214 - phat214;
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tLuong cung: " + luongCung214);
		System.out.println("\tThuong: " + thuong214);
		System.out.println("\tPhat: " + phat214);
		System.out.println("\tLuong thuc linh: " + luongThucLinh214);
	}
	public double getLuongThucLinh() {
		return luongThucLinh214;
	}
}
