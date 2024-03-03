package lab5;

import java.util.Scanner;

public class ChiTiet {
	private int sluong;
	private float dgia;
	private HangHoa hhoa;
	public ChiTiet() {
		sluong = 0;
		dgia = 0.0f;
		hhoa = new HangHoa();
	}
	public ChiTiet(ChiTiet c) {
		sluong = c.sluong;
		dgia = c.dgia;
		hhoa = new HangHoa(c.hhoa);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		hhoa.nhap();
		System.out.print("Nhap so luong cho san pham "+hhoa.getTen()+": "); sluong = sc.nextInt();
		System.out.print("Nhap don gia cho san pham "+hhoa.getTen()+": "); dgia = sc.nextFloat();
	}
	public void in() {
		hhoa.in();
		System.out.printf(" %-10d %-12.2f", sluong, dgia);
	}
	public String toString() {
		
		return hhoa.toString() + String.format(" %-10d %-12.2f", sluong, dgia);
	}
	public float getDgia() {
		return dgia;
	}
	public int getSluong() {
		return sluong;
	}
	public String getTen() {
		return hhoa.getTen();
	}
}
