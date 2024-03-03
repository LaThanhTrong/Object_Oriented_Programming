package lab5;
import java.util.Scanner;

import lab2.Date;
public class KhachHangVIP extends KhachHang {
	private float tLeGiam;
	private Date d;
	public KhachHangVIP() {
		super();
		tLeGiam = 0.0f;
		d = new Date();
	}
	public KhachHangVIP(KhachHangVIP kv) {
		super(kv);
		tLeGiam = kv.tLeGiam;
		d = new Date(kv.d);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ti le giam: "); tLeGiam = sc.nextFloat();
		System.out.println("Nhap ngay khoi tao cho khach hang VIP: "); d.nhapDate();
	}
	public void in() {
		super.in();
		System.out.println("Ti le giam: "+tLeGiam);
		System.out.println("Ngay khoi tao khach hang VIP: "+d);
		
	}
	public String toString() {
		return super.toString() + "Ti le giam: "+tLeGiam+"\n" + "Ngay khoi tao khach hang VIP: "+d+"\n";
	}
	public float getTLeGiam() {
		return tLeGiam;
	}
}
