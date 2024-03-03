package lab3;
import java.util.Scanner;
import lab2.Date;

public class SinhVien {
	//Attributes
	private String mssv, hoTen;
	private Date ngaySinh;
	private int slhocPhan_dangKy;
	private int maxhocPhan;
	private String[] ten_hPhan, diem_hPhan;
	public SinhVien next;
	//Constructors
	public SinhVien() {
		mssv = new String();
		hoTen = new String();
		ngaySinh = new Date();
		slhocPhan_dangKy = 0;
		maxhocPhan = 100;
		ten_hPhan = new String[maxhocPhan];
		diem_hPhan = new String[maxhocPhan];
	}
	public SinhVien(int maxhocPhan) {
		mssv = new String();
		hoTen = new String();
		ngaySinh = new Date();
		slhocPhan_dangKy = 0;
		ten_hPhan = new String[maxhocPhan];
		diem_hPhan = new String[maxhocPhan];
	}
	public SinhVien(String hoTen) {
		mssv = new String();
		this.hoTen = new String(hoTen);
		ngaySinh = new Date();
		slhocPhan_dangKy = 0;
		maxhocPhan = 100;
		ten_hPhan = new String[maxhocPhan];
		diem_hPhan = new String[maxhocPhan];
	}
	public SinhVien(String hoTen, String mssv, Date ngaySinh) {
		this.mssv = new String(mssv);
		this.hoTen = new String(hoTen);
		this.ngaySinh = new Date(ngaySinh);
		slhocPhan_dangKy = 0;
		maxhocPhan = 100;
		ten_hPhan = new String[maxhocPhan];
		diem_hPhan = new String[maxhocPhan];
	}
	public SinhVien(String hoTen, String mssv, Date ngaySinh, int slhocPhan_dangKy, String[] ten_hPhan, String[] diem_hPhan) {
		this.mssv = new String(mssv);
		this.hoTen = new String(hoTen);
		this.ngaySinh = new Date(ngaySinh);
		this.slhocPhan_dangKy = slhocPhan_dangKy;
		this.maxhocPhan = 100;
		this.ten_hPhan = new String[this.maxhocPhan];
		this.diem_hPhan = new String[this.maxhocPhan];
		
		//Iterate copy.
		for(int i = 0; i < this.maxhocPhan; i++) {
			this.ten_hPhan[i] = new String(ten_hPhan[i]);
			this.diem_hPhan[i] = new String(diem_hPhan[i]);
		}
		
	}
	public SinhVien(SinhVien sv) {
		mssv = new String(sv.mssv);
		hoTen = new String(sv.hoTen);
		ngaySinh = new Date(sv.ngaySinh);
		slhocPhan_dangKy = sv.slhocPhan_dangKy;
		maxhocPhan = sv.maxhocPhan;
		ten_hPhan = new String[maxhocPhan];
		diem_hPhan = new String[maxhocPhan];
		
		//Copy all number of courses has registered to new student.
		for(int i = 0; i < slhocPhan_dangKy; i++) {
			ten_hPhan[i] = new String(sv.ten_hPhan[i]);
			diem_hPhan[i] = new String(sv.diem_hPhan[i]);
		}
	}
	//Methods
	public String getName() {
		return hoTen.substring(hoTen.trim().lastIndexOf(" ")+1);
	}
	public String getTaiKhoan() {
		return "";
	}
	public String getEmail() {
		return "";
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten sinh vien: "); hoTen = sc.nextLine();
		System.out.print("Nhap MSSV: "); mssv = sc.nextLine();
		System.out.print("Nhap ngay sinh:\n"); ngaySinh.nhapDate();	
	}
	public boolean courseExist(String ten_hPhan) {
		for(int i = 0; i < slhocPhan_dangKy; i++) {
			if(this.ten_hPhan[i].equals(ten_hPhan)) {
				return true;
			}
		}
		return false;
	}
	public void themhocPhan(String ten_hPhan, String diem_hPhan) {
		if(slhocPhan_dangKy == maxhocPhan) {
			System.out.print("\nSo luong hoc phan dang ky vuot qua quy dinh");
		}
		//Check for course is already exist
		else if(courseExist(ten_hPhan) == true) {
			System.out.print("\nHoc phan "+ten_hPhan+" da ton tai");
		}
		else if(slhocPhan_dangKy < 0 || slhocPhan_dangKy > maxhocPhan) {
			System.out.print("\nSo luong hoc phan dang ky khong hop le!");
		}
		else {
			this.ten_hPhan[slhocPhan_dangKy] = new String(ten_hPhan);
			this.diem_hPhan[slhocPhan_dangKy] = new String(diem_hPhan);
			slhocPhan_dangKy ++;
		}
	}
	public void xoahocPhan(String ten_hPhan) {
		boolean found = false;
		int i = 0;
		for(i = 0; i < slhocPhan_dangKy; i++) {
			if(this.ten_hPhan[i].equals(ten_hPhan)) {
				found = true;
			}
		}
		if(found == true) {
			for(int j = i; j < slhocPhan_dangKy; j++) {
				this.ten_hPhan[j] = this.ten_hPhan[j+1];
				this.diem_hPhan[j] = this.diem_hPhan[j+1];
			}
			slhocPhan_dangKy--;
		}
		else {
			System.out.print("\nHoc phan "+ten_hPhan+" khong ton tai");
		}
	}
	public void in() {
		System.out.print("["+hoTen+", "+mssv+", "+ngaySinh);
		for(int i = 0; i < slhocPhan_dangKy; i++) {
			System.out.print(", "+ten_hPhan[i]+": "+diem_hPhan[i]);
		}
		System.out.print("]");
	}
	public String toString() {
		String s = "["+hoTen+", "+mssv+", "+ngaySinh;
		for(int i = 0; i < slhocPhan_dangKy; i++) {
			s += ", "+ten_hPhan[i]+": "+diem_hPhan[i];
		}
		s += "]";
		return s;
	}
	public void dangKy() {
		Scanner sc = new Scanner(System.in);
		String ten_hPhan = "";
		int n = 0;
		do {
			System.out.print("Nhap so luong mon can dang ky: "); n = sc.nextInt();
		}while(n < 0 || n > maxhocPhan);
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap ten mon thu "+(i+1)+": "); ten_hPhan = sc.nextLine();
			themhocPhan(ten_hPhan,"");
		}
	}
	public void ruthocPhan() {
		Scanner sc = new Scanner(System.in);
		String ten_hPhan = "";
		int n = 0;
		do {
			System.out.print("Nhap so luong hoc phan can rut: "); n = sc.nextInt();
		}while(n < 0 || n > maxhocPhan);
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap ten mon thu "+(i+1)+": "); ten_hPhan = sc.nextLine();
			xoahocPhan(ten_hPhan);
		}
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < slhocPhan_dangKy; i++) {
			System.out.print("Nhap diem cho mon hoc "+ten_hPhan[i]+": "); diem_hPhan[i] = sc.nextLine();
		}
	}
	public float diemtBinh() {
		float diem = 0.0f;
		for(int i = 0; i < slhocPhan_dangKy; i++) {
			switch(diem_hPhan[i]) {
				case "A": 
					diem += 4.0f;
					break;
				case "B+":
					diem += 3.5f;
					break;
				case "B":
					diem += 3.0f;
					break;
				case "C+":
					diem += 2.5f;
					break;
				case "C":
					diem += 2.0f;
					break;
				case "D+":
					diem += 1.5f;
					break;
				case "D":
					diem += 1.0f;
					break;
				case "F":
					diem += 0.0f;
					break;
			}
		}
		return diem / slhocPhan_dangKy;
	}
}
