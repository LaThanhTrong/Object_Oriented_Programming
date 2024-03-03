package lab4;
public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau A = new DiemMau(5,10,"Trang");
		A.hienThi();
		DiemMau B = new DiemMau();
		System.out.print("\n");
		B.nhapDiem();
		B.doiDiem(10, 8);
		B.hienThi();
	}
}
