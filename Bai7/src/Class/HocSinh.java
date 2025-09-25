package Class;
import java.util.Scanner;
public class HocSinh extends Nguoi {
	private String lop214;
	private String khoHoc214;
	private String kyHoc214;
	public HocSinh() {
	}
	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen214 = hoTen214;
		this.lop214 = lop214;
		this.khoHoc214 = khoHoc214;
		this.kyHoc214 = kyHoc214;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap lop: ");
		lop214 = sc.nextLine();
		System.out.print("\tNhap khoa hoc: ");
		khoHoc214 = sc.nextLine();
		System.out.print("\tNhap ky hoc: ");
		kyHoc214 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tLop: " + lop214);
		System.out.println("\tKhoa hoc: " + khoHoc214);
		System.out.println("\tKy hoc: " + kyHoc214);
	}
	public String getLop() {
		return lop214;
	}
}
