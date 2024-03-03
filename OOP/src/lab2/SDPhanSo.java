package lab2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhanSo a = new PhanSo(3,7); 
		PhanSo b = new PhanSo(4,9);
		System.out.print("Phan so a: "); a.inPhanSo();
		System.out.println("Phan so b: "+b);
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Phan so x: "); 
		x.nhapPhanSo();
		System.out.println("Phan so y: "); 
		y.nhapPhanSo();
		System.out.println("Phan so x nghich dao: "+x.giaTriNghichDao());
		System.out.println(x+" + "+y+" = "+x.cong(y));
		
		System.out.print("Nhap n phan so: "); int n = sc.nextInt();
		//Cung cap do dai mang
		PhanSo danhsach[] = new PhanSo[n];
		//Cung cap bo nho cho tung doi tuong
		for(int i = 0; i<danhsach.length; i++) {
			 danhsach[i] = new PhanSo();
			 //danhsach[i].nhapPhanSo();
		}
		//Nhap danh sach
		for(int i = 0; i<danhsach.length; i++) {
			System.out.println("Nhap phan so thu "+(i+1));
			danhsach[i].nhapPhanSo();
		}
		
		//Tong tat ca cac phan so trong danh sach
		PhanSo sum = new PhanSo();
		for(int i = 0; i<danhsach.length; i++) {
			sum = sum.cong(danhsach[i]);
		}
		System.out.println("Tong cac phan so trong danh sach: "+sum);
		
		//Tim phan so lon nhat
		PhanSo max = new PhanSo(Integer.MIN_VALUE,1);
		for(int i = 0; i<danhsach.length; i++) {
			if(max.giaTriThuc() < danhsach[i].giaTriThuc()) {
				max = danhsach[i];
			}
		}
		System.out.println("So lon nhat trong danh sach: "+max);
		
		//Sap xep danh sach tang dan
		PhanSo current = new PhanSo();
		for(int i = 1; i<danhsach.length; i++) {
			current = danhsach[i];
			int j = i-1;
			while(j >= 0 && danhsach[j].lonHon(current)) {
				danhsach[j+1] = danhsach[j];
				j -= 1;
			}
			danhsach[j+1] = current;
		}
		
		System.out.println("Danh sach sau khi sap xep tang dan:");
		for(int i = 0; i<danhsach.length; i++) {
			danhsach[i].inPhanSo();
		}
	}
}
