package lab3;

import java.util.Scanner;

import lab2.Diem;

public class SDDoanThang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,35);
		DoanThang AB = new DoanThang(A,B);
		/*
		 DoanThang d1 = AB; //Shallow Copy
		 DoanThang d2 = new DoanThang(AB); //Deep Copy
		 
		 DoanThang d3 = new DoanThang;
		 d3.AB.clone();
		 d3.set1(AB); //Shallow Copy;
		 d3.set2(AB); //Deep Copy;
		 */
		System.out.print("Doan thang AB: "+AB);
		AB.tinhTien(5,3);
		System.out.print("\nSau khi tinh tien AB (5,3): "+AB);
		DoanThang CD = new DoanThang();
		System.out.print("\n");
		CD.nhapDoanThang();
		System.out.print("Doan thang CD: "+CD);
		System.out.print("\nGoc cua doan thang CD voi truc Ox: "+CD.angleOx());
		System.out.print("\nTrung diem cua doan thang AB: "+AB.trungDiem());
		
		/*
		//Mang doan thang
		System.out.print("\nNhap so doan thang: "); int n = sc.nextInt();
		DoanThang ds[] = new DoanThang[n];
		
		for(int i = 0; i<ds.length; i++) {
			//Cap phat bo nho cho tung doi tuong
			ds[i] = new DoanThang();  
		}
		for(int i = 0; i<ds.length; i++) {
			System.out.print("Nhap doan thang thu "+(i+1)+": "); ds[i].nhapDoanThang();
		}
		for(int i = 0; i<ds.length; i++) {
			System.out.print("Doan thang thu "+(i+1)+": "); ds[i].hienThi();	
		}
		*/
	}
}
