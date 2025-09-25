package Class;
import java.util.Scanner;
public class Bao extends TaiLieu {
	private String ngayPhatHanh214;
	public Bao() {
	}
	public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh214) 
        {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh214 = ngayPhatHanh214;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh214 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh214);
	}
}
