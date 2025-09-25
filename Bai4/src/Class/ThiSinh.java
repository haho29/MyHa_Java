package Class;
import java.util.Scanner;
public class ThiSinh {
	private int soBD214;
	private String hoTen214;
	private String diaChi214;
	private String dienUuTien214;
	public ThiSinh() {
	}
	public ThiSinh(int soBD214, String hoTen214, String diaChi214, String dienUuTien214) {
		this.soBD214 = soBD214;
		this.hoTen214 = hoTen214;
		this.diaChi214 = diaChi214;
		this.dienUuTien214 = dienUuTien214;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD214 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen214 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi214 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien214 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD214);
		System.out.println("\tHo ten: " + hoTen214);
		System.out.println("\tDia chi: " + diaChi214);
		System.out.println("\tDien uu tien: " + dienUuTien214);
	}   
	public int getSoBD() {
		return soBD214;
	}
}
