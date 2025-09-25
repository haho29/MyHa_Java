package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
	private String hoTen214;
	private Date ngaySinh214;
	private String ngheNghiep214;
	public Nguoi() {
	}
	public Nguoi(String hoTen214, Date ngaySinh214, String ngheNghiep214) {
		this.hoTen214 = hoTen214;
		this.ngaySinh214 = ngaySinh214;
		this.ngheNghiep214 = ngheNghiep214;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen214 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh214 = strToDate(strDate);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep214 = sc.nextLine();
	}
	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen214);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh214));
		System.out.println("\tNghe nghiep: " + ngheNghiep214);
	}
	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = sdf.format(date);
		return strDate;
	}
	public Date getNgaySinh() {
		return ngaySinh214;
	}
}
