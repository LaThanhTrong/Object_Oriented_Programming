package lab3;
import java.util.Scanner;
import lab2.Diem;

public class DoanThang {
	//Attribute
	private Diem d1,d2;
	//Constructors (must allocate memory)
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem d1, Diem d2) {
		this.d1 = new Diem(d1); 
		this.d2 = new Diem(d2); 
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public DoanThang(DoanThang d) {
		d1 = new Diem(d.d1);
		d2 = new Diem(d.d2);
	}
	public Object clone() throws CloneNotSupportedException{
		//Call shallow copy from parent
		return super.clone();
	}
	public void set1(DoanThang d) {
		//Shallow Copy
		d1 = d.d1;
		d2 = d.d2;
	}
	public void set2(DoanThang d) {
		//Deep Copy
		d1 = new Diem(d.d1);
		d2 = new Diem(d.d2);
	}
	public void nhapDoanThang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do diem dau: "); 
		d1.nhapDiem();
		System.out.println("Nhap toa do diem cuoi: ");
		d2.nhapDiem();
	}
	public void hienThi() { //[d1(x,y), d2(x,y)]
		System.out.print("["); 
		d1.hienThi();
		System.out.print(",");
		d2.hienThi();
		System.out.print("]");
	}
	public String toString() {
		return "[" + d1 + "," + d2 + "]";
	}
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float khoangCach() { //d1--->d2
		return d1.khoangCach(d2);
	}
	public Diem trungDiem() {
		Diem I = new Diem();
		I.ganX((d1.giaTriX() + d2.giaTriX())/2);
		I.ganY((d1.giaTriY() + d2.giaTriY())/2);
		return I;
	}
	public float angleOx() {
		double Rad2Deg = 180 / Math.PI;
		return (float) (Math.atan2(d2.giaTriY() - d1.giaTriY(), d2.giaTriX() - d1.giaTriX()) * Rad2Deg);
	}
}
