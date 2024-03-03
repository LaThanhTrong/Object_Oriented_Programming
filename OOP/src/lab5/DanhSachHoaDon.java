package lab5;

import java.util.Scanner;

public class DanhSachHoaDon {
	private int sl;
	private HoaDon hd[];
	public DanhSachHoaDon() {
		sl = 0;
		hd = new HoaDon[100];
	}
	public DanhSachHoaDon(DanhSachHoaDon ds) {
		sl = ds.sl;
		hd = new HoaDon[ds.hd.length];
		for(int i = 0; i<sl; i++) {
			hd[i] = new HoaDon(ds.hd[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong hoa don: "); sl = sc.nextInt();
		for(int i = 0; i<sl; i++) {
			System.out.println("\t\t\t\t************ Vui long nhap thong tin hoa don thu "+(i+1)+" ************");
			hd[i] = new HoaDon();
			hd[i].nhap();
		}
	}
	public void in() {
		for(int i = 0; i<sl; i++) {
			System.out.println("\n\t\t\t\t************ Thong tin hoa don thu "+(i+1)+" ************");
			hd[i].in();
		}
	}
	public String toString() {
		String s = new String();
		for(int i = 0; i<sl; i++) {
			s += "\n\t\t\t\t************ Thong tin hoa don thu "+(i+1)+" ************";
			s += hd[i].toString();
		}
		return s;
	}
	public void findMaSo(String code) {
		boolean flag = false;
		int i = 0;
		try {
			for(i = 0; i<sl; i++) {
				if(hd[i].getMaSo().equals(code)) {
					flag = true;
					break;
				}
			}
			if(flag == true) {
				hd[i].in();
			}
			else {
				System.out.print("Ma so hoa don khong duoc tim thay!");
			}
		}catch(Exception e) {
			System.out.print("Vui long nhap thong tin hoa don truoc khi su dung chuc nang khac");
		}
	}
	public float doanhThutheoThang(int month, int year) {
		float sum = 0.0f;
		try {
			for(int i = 0; i<sl; i++) {
				sum += hd[i].tongHoaDontheoThang(month, year);
			}
		}catch(Exception e) {
			System.out.print("Vui long nhap thong tin hoa don truoc khi su dung chuc nang khac");
		}
		return sum;
	}
	public float doanhThuSanPhamtheoThang(String item, int month, int year) {
		float sum = 0.0f;
		try {
			for(int i = 0; i<sl; i++) {
				sum += hd[i].tongSanPhamtheoThang(item, month, year);
			}
		}catch(Exception e) {
			System.out.print("Vui long nhap thong tin hoa don truoc khi su dung chuc nang khac");
		}
		return sum;
	}
}
