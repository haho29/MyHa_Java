package Class;
import java.util.Scanner;
public class TaiLieu {
	private String maTaiLieu214;
	private String tenNXB214;
	private int soBanPhatHanh214;
	public TaiLieu() {
	}
	public TaiLieu(String maTaiLieu214, String tenNXB214, int soBanPhatHanh214) {
		this.maTaiLieu214 = maTaiLieu214;
		this.tenNXB214 = tenNXB214;
		this.soBanPhatHanh214 = soBanPhatHanh214;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu214 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB214 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh214 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu214);
		System.out.println("\tTen nha xuat ban: " + tenNXB214);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh214);
	}
	public String getMaTaiLieu() {
		return maTaiLieu214;
	}
}
