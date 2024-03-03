package lab5;

import java.util.Scanner;

import lab2.Date;

public class HoaDon {
	private String mso, tde, nvien;
	private KhachHang kh;
	private ChiTiet ct[];
	private Date d;
	private int sl;
	
	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		kh = new KhachHang();
		ct = new ChiTiet[20];
		d = new Date();
		sl = 0;
	}
	public HoaDon(HoaDon hd) {
		mso = new String(hd.mso);
		tde = new String(hd.tde);
		nvien = new String(hd.nvien);
		kh = new KhachHang(hd.kh);
		ct = new ChiTiet[hd.ct.length];
		for(int i = 0; i<sl; i++) {
			ct[i] = new ChiTiet(hd.ct[i]);
		}
		d = new Date(hd.d);
		sl = hd.sl;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		System.out.print("Nhap ma so hoa don: "); mso = sc.nextLine();
		System.out.print("Nhap tieu de hoa don: "); tde = sc.nextLine();
		System.out.print("Nhap nhan vien tao hoa don: "); nvien = sc.nextLine();
		do {
		System.out.print("Nhap loai khach hang: 0/Thuong, 1/VIP: "); c = sc.nextInt();
		}while(c != 0 && c != 1);
		if(c == 0) {
			kh.nhap();
		}
		else {
			kh = new KhachHangVIP();
			kh.nhap();
		}
		System.out.print("Nhap so luong chi tiet hang hoa: "); sl = sc.nextInt();
		for(int i = 0; i<sl; i++) {
			System.out.println("******* Nhap thong tin hang hoa thu "+(i+1)+" *******");
			ct[i] = new ChiTiet();
			ct[i].nhap();
		}
		System.out.println("Nhap ngay tao hoa don: ");
		d.nhapDate();
	}
	public void in() {
		System.out.println("Ma so hoa don: "+mso);
		System.out.println("Tien de: "+tde);
		System.out.println("Nhan vien hoa don: "+nvien);
		kh.in();
		System.out.println("\n******* Thong tin hang hoa *******");
		System.out.printf("%-5s %-10s %-25s %-15s %-10s %-12s %n", "STT", "Ma so", "Ten hang hoa", "Ngay san xuat", "So luong", "Don gia");
		for(int i = 0; i<sl; i++) {
			System.out.printf("%-5d ",(i+1));
			ct[i].in();
			System.out.print("\n");
		}
		System.out.println("Ngay tao hoa don: "+d);
		System.out.printf("Tong hoa don: %.2f",tong());
	}
	public String toString() {
		String s = new String("\n******* Thong tin hang hoa *******\n");
		s += String.format("%-5s %-10s %-25s %-15s %-10s %-12s %n", "STT", "Ma so", "Ten hang hoa", "Ngay san xuat", "So luong", "Don gia");
		for(int i = 0; i<sl; i++) {
			s += String.format("%-5d ",(i+1));
			s += ct[i];
			s += "\n";
		}
		return "Ma so hoa don: "+mso+"\nTieu de: "+tde+"\nNhan vien hoa don: "+nvien+"\n"+kh+s+"Ngay tao hoa don: "+d+"\nTong hoa don: "+String.format("%.2f",tong())+"\n";
	}
	public float tong() {
		float sum = 0.0f;
		for(int i = 0; i<sl; i++) {
			sum += ct[i].getSluong() * ct[i].getDgia();
		}
		sum = sum - sum * kh.getTLeGiam();
		return sum;
	}
	public String getMaSo() {
		return mso;
	}
	public float tongHoaDontheoThang(int month, int year) {
		float sum = 0.0f;
		if(d.getMonth() == month && d.getYear() == year) {
			for(int i = 0; i<sl; i++) {
				sum += ct[i].getSluong() * ct[i].getDgia();
			}
		}
		sum = sum - sum * kh.getTLeGiam();
		return sum;
	}
	public float tongSanPhamtheoThang(String sp, int month, int year) {
		boolean flag = false;
		float sum = 0.0f;
		int i = 0;
		if(d.getMonth() == month && d.getYear() == year) {
			for(i = 0; i<sl; i++) {
				if(ct[i].getTen().equals(sp)) {
					flag = true;
					break;
				}
			}
			if(flag == true) {
				sum += ct[i].getSluong() * ct[i].getDgia();
				sum = sum - sum * kh.getTLeGiam();
			}
		}
		return sum;
	}
}
