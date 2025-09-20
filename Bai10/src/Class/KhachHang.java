package Class;
import java.util.Scanner;
public class KhachHang {
	protected String tenChuHo214;
	protected int soNha214;
	protected String maCongTo214;
	public KhachHang() {
	}
	public KhachHang(String tenChuHo214, int soNha214, String maCongTo214) {
		this.tenChuHo214 = tenChuHo214;
		this.soNha214 = soNha214;
		this.maCongTo214 = maCongTo214;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo214 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha214 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo214 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo214);
		System.out.println("\tSo nha: " + soNha214);
		System.out.println("\tMa cong to: " + maCongTo214);
	}
}
