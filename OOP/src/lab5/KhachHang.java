package lab5;

import java.util.Scanner;

public class KhachHang {
	//Atributes
	private String cccd, hten, dchi;
	//Contructors
	public KhachHang() {
		cccd = new String();
		hten = new String();
		dchi = new String();
	}
	
	public KhachHang(KhachHang k) {
		cccd = new String(k.cccd);
		hten = new String(k.hten);
		dchi = new String(k.dchi);
	}
	
	//Methods
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap CCCD: "); cccd = sc.nextLine();
		System.out.print("Nhap ho va ten khach hang: "); hten = sc.nextLine();
		System.out.print("Nhap dia chi: "); dchi = sc.nextLine();
	
	}
	public void in() {
		System.out.println("Thong tin khach hang:");
		System.out.println("CCCD: "+cccd);
		System.out.println("Ho va ten khach hang: "+hten);
		System.out.println("Dia chi: "+dchi);
	}
	public String toString() {
		return "Thong tin khach hang:\nCCCD: "+cccd+"\nHo va ten khach hang: "+hten+"\nDia chi: "+dchi+"\n";
	}
	public float getTLeGiam() {
		return 0.0f;
	}
}
