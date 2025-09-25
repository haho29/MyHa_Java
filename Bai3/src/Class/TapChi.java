package Class;
import java.util.Scanner;
public class TapChi extends TaiLieu {
	private int soPhatHanh214;
	private int thangPhatHanh214;
	public TapChi() {
	}
	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, 
                int soPhatHanh214, int thangPhatHanh214) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh214 = soBanPhatHanh;
		this.thangPhatHanh214 = thangPhatHanh214;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh214 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh214 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh214);
		System.out.println("\tThang phat hanh: " + thangPhatHanh214);
	}
}
