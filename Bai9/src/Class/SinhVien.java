package Class;
import java.util.Scanner;
public class SinhVien {
	protected String hoTen214;
	protected String maSV214;
	protected String ngaySinh214;
	protected String lop214;
	public SinhVien() {
	}
	public SinhVien(String hoTen214, String maSV214, String ngaySinh214, String lop214) {
		this.hoTen214 = hoTen214;
		this.maSV214 = maSV214;
		this.ngaySinh214 = ngaySinh214;
		this.lop214 = lop214;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen214 = sc.nextLine();
		System.out.print("\tNhap ma sinh vien: ");
		maSV214 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh214 = sc.nextLine();
		System.out.print("\tNhap lop: ");
		lop214 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen214);
		System.out.println("\tNgay sinh: " + ngaySinh214);
		System.out.println("\tMa sinh vien: " + maSV214);
		System.out.println("\tLop: " + lop214);
	}
}
