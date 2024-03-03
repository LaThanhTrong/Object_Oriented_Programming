package lab4;
import java.util.Scanner;

import lab3.SinhVien;
public class SinhVienCNTT extends SinhVien {
	private String taikhoan, matkhau, email;
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv);
		taikhoan = sv.taikhoan;
		matkhau = sv.matkhau;
		email = sv.email;
	}
	public void nhap() {
		super.nhap();
		super.dangKy();
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tai khoan: "); taikhoan = sc.nextLine();
		System.out.print("Nhap matkhau: "); matkhau = sc.nextLine();
		System.out.print("Nhap email: "); email = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.print(" Tai khoan: "+taikhoan+", Email: "+email);
	}
	public String toString() {
		return super.toString() + " Tai khoan: "+taikhoan+", Email: "+email;
	}
	public String getTaiKhoan() {
		return taikhoan;
	}
	public String getMatKhau() {
		return matkhau;
	}
	public String getEmail() {
		return email;
	}
	public void setTaiKhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public void doiMatKhau(String newpass) {
		matkhau = newpass;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
