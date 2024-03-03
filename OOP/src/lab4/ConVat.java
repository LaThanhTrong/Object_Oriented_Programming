package lab4;

import java.util.Scanner;

public abstract class ConVat {
	private String giong, mau_long;
	private float can_nang;
	public abstract void Keu();
	public ConVat() {
		giong = new String();
		mau_long = new String();
		can_nang = 0.f;
	}
	public ConVat(String giong, String mau_long, float can_nang) {
		this.giong = new String(giong);
		this.mau_long = new String(mau_long);
		this.can_nang = can_nang;
	}
	public ConVat(ConVat a) {
		giong = new String(a.giong);
		mau_long = new String(a.mau_long);
		can_nang = a.can_nang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap giong: "); giong = sc.nextLine();
		System.out.print("Nhap mau long: "); mau_long = sc.nextLine();
		System.out.print("Nhap can nang: "); can_nang = sc.nextFloat();
	}
	public void hienThi() {
		System.out.print("Giong: "+giong+", Mau long: "+mau_long+", Can nang: "+can_nang+"kg");
	}
	public String toString() {
		return "Giong: "+giong+", Mau long: "+mau_long+", Can nang: "+can_nang+"kg";
	}
}
