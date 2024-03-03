package lab2;
import java.util.Scanner;

import lab2.Date;
public class SDDate {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		Date current = new Date();
		Date d1 = new Date(1,1,2000);
		System.out.print("Current Date: "); current.hienThi();
		System.out.print("Date d1: "+d1); 
		System.out.print("\n");
		Date d2 = new Date();
		d2.nhapDate();
		System.out.print("Date d2: "+d2); 
		//d2 = d2.ngayHomSau();
		System.out.print("\nNext day of d2 is "+d2.ngayHomSau()); 
		do {
			System.out.print("\nEnter number of days n: "); n = sc.nextInt();
		}while(n<0);
		System.out.print("After "+n+" days added for d2: "+d2.congNgay(n)); 
	}

}
