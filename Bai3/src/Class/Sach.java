package Class;
import java.util.Scanner;
public class Sach extends TaiLieu {
	private String tacGia214;
	private int soTrang214;
	public Sach() {
	}
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, 
                String tacGia214, int soTrang214) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia214 = tacGia214;
		this.soTrang214 = soTrang214;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia214 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang214 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia214);
		System.out.println("\tSo trang: " + soTrang214);
	}
}
