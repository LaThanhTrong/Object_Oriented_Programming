package lab5;

import java.util.Scanner;

import lab2.Date;

public class HangHoa {
	private String mso, ten;
	private Date nsxuat;
	public HangHoa() {
		mso = new String();
		ten = new String();
		nsxuat = new Date();
	}
	public HangHoa(HangHoa h) {
		mso = new String(h.mso);
		ten = new String(h.ten);
		nsxuat = new Date(h.nsxuat);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so hang hoa: "); mso = sc.nextLine();
		System.out.print("Nhap ten hang hoa: "); ten = sc.nextLine();
		System.out.println("Nhap ngay san xuat: "); nsxuat.nhapDate();
	}
	public void in() {
		System.out.printf("%-10s %-25s %-15s", mso, ten, nsxuat.toString());
	}
	public String toString() {
		return String.format("%-10s %-25s %-15s", mso, ten, nsxuat.toString());
	}
	public String getTen() {
		return ten;
	}
}
