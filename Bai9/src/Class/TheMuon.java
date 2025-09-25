package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class TheMuon extends SinhVien {
	private int soMuon214;
	private Date ngayMuon214;
	private Date hanTra214;
	private String soHieu214;
	public TheMuon() {
	}
	public TheMuon(int soMuon214, Date ngayMuon214, String soHieu214) {
		this.soMuon214 = soMuon214;
		this.ngayMuon214 = ngayMuon214;
		this.soHieu214 = soHieu214;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so muon: ");
		soMuon214 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon214 = strToDate(strNgayMuon);
		String strNgayTra = "31-12-2020";
		hanTra214 = strToDate(strNgayTra);
		System.out.println("\tNhap so hieu: ");
		soHieu214 = sc.nextLine();
	}
	private Date strToDate(String strNgayMuon) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phieu muon: " + soMuon214);
		System.out.println("\tNgay muon: " + ngayMuon214);
		System.out.println("\tHan tra: " + hanTra214);
		System.out.println("\tSo hieu: " + soHieu214);
	}
	public Date getHanTra() {
		return hanTra214;
	}
}
