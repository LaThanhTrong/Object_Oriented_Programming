package lab2;

import java.util.Scanner;

public class PhanSo {
	//Attributes
	private int tuso, mauso;
	//Constructors
	public PhanSo() {
		tuso = 0;
		mauso = 1;
	}
	public PhanSo(int tuso, int mauso) {
		this.tuso = tuso;
		this.mauso = mauso;
	}
	public PhanSo(PhanSo p) {
		tuso = p.tuso;
		mauso = p.mauso;
	}
	//Methods
	public void nhapPhanSo() {
		Scanner sc = new Scanner(System.in); 
		boolean flag = false, check0 = false;
		//Check for valid numerator
		do {
			System.out.print("Nhap tu so: "); String tu = sc.next();
			try {
				tuso = Integer.parseInt(tu);
				flag = false;
				
			}catch(Exception e) {
				System.out.println("Sai dinh dang tu so, vui long nhap lai");
				flag = true;
			}
		}while(flag == true);
		
		//Check for valid denominator
		do {
			System.out.print("Nhap mau so: "); String mau = sc.next();
			if(mau.matches("0")) {
				System.out.println("Mau so khong duoc la 0, vui long nhap lai");
				check0 = true;
			}
			else {
				check0 = false;
			}
			try {
				mauso = Integer.parseInt(mau);
				flag = false;
			}catch(Exception e) {
				System.out.println("Sai dinh dang mau so, vui long nhap lai");
				flag = true;
			}
		}while(flag == true || check0 == true);
	}
	
	public void inPhanSo() { // tu / mau , -tu / mau , if tu = 0 => 0, if mau = 1 => tu, if tu and mau negative => tu / mau.
		if(mauso == 1) {
			System.out.println(tuso);
		}
		else if(tuso == 0) {
			System.out.println(0);
		}
		else if(tuso < 0 && mauso < 0) {
			System.out.println(Math.abs(tuso)+" / "+Math.abs(mauso));
		}
		else if(mauso < 0 && tuso > 0) {
			System.out.println(-tuso+" / "+Math.abs(mauso));
		}
		else if(mauso == 0) {
			System.out.println("Khong the chia het cho 0");
		}
		else {
			System.out.println(tuso+" / "+mauso);
		}
	}
	
	public String toString() {
		if(mauso == 1) return tuso+"";
		else if(tuso == 0) return "0";
		else if(tuso < 0 && mauso < 0) return Math.abs(tuso)+" / "+Math.abs(mauso);
		else if(mauso < 0 && tuso > 0) return -tuso+" / "+Math.abs(mauso);
		else if(mauso == 0) return "Khong the chia het cho 0";
		else return tuso+" / "+mauso;
	}
	
	public void nghichDao() {
		int temp = tuso;
		tuso = mauso;
		mauso = temp;
	}
	
	public PhanSo giaTriNghichDao() {
		PhanSo phanso = new PhanSo();
		phanso.tuso = mauso;
		phanso.mauso = tuso;
		return phanso;
	}
	
	public float giaTriThuc() {
		float giatri = (float) tuso / mauso;
		return giatri;
	}
	
	public boolean lonHon(PhanSo a) {
		if( ( (float)(tuso / mauso) ) > ( (float)(a.tuso / a.mauso) )) return true;
		return false;
	}
	
	public PhanSo cong(PhanSo a) {
		PhanSo tong = new PhanSo();
		if(mauso == a.mauso) {
			tong.mauso = mauso;
			tong.tuso = tuso + a.tuso;
		}
		else {
			tong.tuso = (tuso * a.mauso) + (a.tuso * mauso);
			tong.mauso = (mauso * a.mauso);
		}
		return tong;
	}
	
	public PhanSo cong(int a) {
		PhanSo tong = new PhanSo(tuso,mauso);
		PhanSo temp = new PhanSo(a,1);
		tong = tong.cong(temp);
		return tong;
	}
	
	public PhanSo tru(PhanSo a) {
		PhanSo hieu = new PhanSo();
		if(mauso == a.mauso) {
			hieu.mauso = mauso;
			hieu.tuso = tuso - a.tuso;
		}
		else {
			hieu.tuso = (tuso * a.mauso) - (a.tuso * mauso);
			hieu.mauso = (mauso * a.mauso);
		}
		return hieu;
	}
	
	public PhanSo tru(int a) {
		PhanSo hieu = new PhanSo(tuso,mauso);
		PhanSo temp = new PhanSo(a,1);
		hieu = hieu.tru(temp);
		return hieu;
	}
	
	public PhanSo nhan(PhanSo a) {
		PhanSo tich = new PhanSo();
		tich.tuso = tuso * a.tuso;
		tich.mauso = mauso * a.mauso;
		return tich;
	}
	
	public PhanSo nhan(int a) {
		PhanSo tich = new PhanSo(tuso,mauso);
		PhanSo temp = new PhanSo(a,1);
		tich = tich.nhan(temp);
		return tich;
	}
	
	public PhanSo chia(PhanSo a) {
		PhanSo thuong = new PhanSo();
		thuong.tuso = tuso * a.mauso;
		thuong.mauso = mauso * a.tuso;
		return thuong;
	}
	
	public PhanSo chia(int a) {
		PhanSo thuong = new PhanSo(tuso,mauso);
		PhanSo temp = new PhanSo(a,1);
		thuong = thuong.chia(temp);
		return thuong;
	}
}
