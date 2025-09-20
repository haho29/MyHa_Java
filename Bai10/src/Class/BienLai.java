package Class;
import java.util.Scanner;
public class BienLai extends KhachHang {
	private int chiSoMoi214;
	private int chiSoCu214;
	private double tien214;
	public BienLai() {
	}
	public BienLai(int chiSoMoi214, int chiSoCu214, double tien214) {
		this.chiSoMoi214 = chiSoMoi214;
		this.chiSoCu214 = chiSoCu214;
		this.tien214 = tien214;
	}
	public BienLai(String tenChuHo214, int chiSoMoi214, int chiSoCu214, double tien214) {
		this.tenChuHo214 = tenChuHo214;
		this.chiSoMoi214 = chiSoMoi214;
		this.chiSoCu214 = chiSoCu214;
		this.tien214 = tien214;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi214 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu214 = sc.nextInt();
		sc.nextLine();
		tien214 = (chiSoMoi214 - chiSoCu214) * 750;
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi214);
		System.out.println("\tChi so cu: " + chiSoCu214);
		System.out.println("\tTien: : " + tien214);
	}
}
