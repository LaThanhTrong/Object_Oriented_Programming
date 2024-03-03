package lab4;
import java.util.Scanner;

import lab2.Diem;
public class DiemMau extends Diem {
	private String mau;
	public DiemMau() {
		super(); 
		mau = new String();
	}
	public DiemMau(int x, int y, String mau) {
		super(x,y); 
		this.mau = new String(mau);
	}
	public DiemMau(DiemMau d) {
		super(d);
		this.mau = new String(d.mau);
	}
	public void GanMau(String mau) {
		this.mau = new String(mau);
	}
	public String LayMau() {
		return mau;
	}
	public void nhapDiem() {
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mau: "); mau = sc.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.print(" mau: "+mau);
	}
	public String toString() {
		return super.toString() + (", mau: "+mau);
	}
	
}
