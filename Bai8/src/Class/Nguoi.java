package Class;
import java.util.Scanner;
public class Nguoi {
	protected String hoTen214;
	protected String ngaySinh214;
	protected String queQuan214;
	public Nguoi() {
	}
	public Nguoi(String hoTen214, String ngaySinh214, String queQuan214) {
		this.hoTen214 = hoTen214;
		this.ngaySinh214 = ngaySinh214;
		this.queQuan214 = queQuan214;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen214 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh214 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan214 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen214);
		System.out.println("\tNgay sinh: " + ngaySinh214);
		System.out.println("\tQue quan: " + queQuan214);
	}
}
