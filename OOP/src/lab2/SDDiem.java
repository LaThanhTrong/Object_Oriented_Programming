package lab2;

public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Diem A: "); A.hienThi();
		System.out.print("\n");
		Diem B = new Diem();
		B.nhapDiem();
		System.out.print("Diem B: "); B.hienThi();
		Diem C = new Diem(-B.giaTriX(),-B.giaTriY());
		System.out.print("\n");
		System.out.print("Diem C: "+C);
		System.out.print("\n");
		System.out.println("Khoang cach tu diem B den tam 0 la: "+B.khoangCach());
		System.out.println("Khoang cach tu diem A den diem B la: "+A.khoangCach(B));
	}
}
