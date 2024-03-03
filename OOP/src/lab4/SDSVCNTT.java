package lab4;
import java.util.Scanner;

public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien CNTT: "); int n = sc.nextInt();
		SinhVienCNTT list[] = new SinhVienCNTT[n];
		for(int i = 0; i<n; i++) {
			list[i] = new SinhVienCNTT();
			list[i].nhap();
		}
		for(int i = 0; i<n; i++) {
			list[i].in();
			System.out.print("\n");
		}
		sc.nextLine();
		System.out.print("Nhap email de tim kiem: "); String e = sc.nextLine();
		for(int i = 0; i<n; i++) {
			if(e.equals(list[i].getEmail())) {
				list[i].in();
			}
		}
	}
}
