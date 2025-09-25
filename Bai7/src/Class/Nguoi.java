package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
	protected String hoTen214;
	protected Date ngaySinh214;
	protected String queQuan214;
	public Nguoi() {
	}
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen214 = hoTen214;
		this.ngaySinh214 = ngaySinh214;
		this.queQuan214 = queQuan214;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen214 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh214= strToDate(strDate);
		System.out.print("\tNhap que quan: ");
		queQuan214 = sc.nextLine();
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
		System.out.println("\tNgay sinh: " + ngaySinh214);
		System.out.println("\tQue quan: " + queQuan214);
	}
	public String getQueQuan() {
		return queQuan214;
	}
	public Date getNgaySinh() {
		return ngaySinh214;
	}
}

