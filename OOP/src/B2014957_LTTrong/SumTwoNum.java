package B2014957_LTTrong;

import java.util.Scanner;

public class SumTwoNum {
	public int nhap() {
		Scanner sc = new Scanner(System.in);
		String a; int n = 0; boolean flag = false;
		do {
			System.out.print("Nhap vao so nguyen: "); a = sc.next();
			try {
				n = Integer.parseInt(a);
				flag = false;
			}catch(Exception e) {
				flag = true;
				System.out.println("Nhap sai dinh dang, vui long nhap lai!");
			}
		}while(flag == true);
		return n;
	}
	
	public static void main(String[] args) {
		SumTwoNum p = new SumTwoNum();
		int a = p.nhap();
		int b = p.nhap();
		System.out.print("Tong 2 so: "+(a+b));
	}
}
