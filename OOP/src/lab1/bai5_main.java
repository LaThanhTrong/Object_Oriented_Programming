package lab1;

import java.util.Scanner;

public class bai5_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: "); double a = sc.nextDouble();
		System.out.print("Nhap b: "); double b = sc.nextDouble();
		System.out.print("Nhap c: "); double c = sc.nextDouble();
		sc.close();
		if(a==0) {
			bai5.ptb1(b, c);
		}
		else {
			bai5.ptb2(a,b,c);
		}
	}
}

