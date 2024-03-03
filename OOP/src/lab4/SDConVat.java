package lab4;

import java.util.Scanner;

public class SDConVat {

	public static void main(String[] args) {
		/*
		Bo cow = new Bo();
		cow.nhap();
		cow.hienThi();
		System.out.print("\n");
		cow.Keu();
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap bao nhieu dong vat: "); int n = sc.nextInt();
		//Create a list of different animal
		ConVat list[] = new ConVat[100];
		int c = 0;
		for(int i = 0; i<n; i++) {
			System.out.println("Nhap vao dong vat thu "+(i+1));
			System.out.print("Chon loai dong vat {0(Bo), 1(Heo), 2(De)}: "); c = sc.nextInt();
			switch(c) {
				case 0: 
					list[i] = new Bo();
					list[i].nhap();
					break;
				case 1:
					list[i] = new Heo();
					list[i].nhap();
					break;
				case 2:
					list[i] = new De();
					list[i].nhap();
					break;
				default:
					System.out.println("Khong ton tai!");
			}
		}
		for(int i = 0; i<n; i++) {
			list[i].Keu();
		}
		
		
		System.out.println("Sau khi them dong vat ga vao nong trai: ");
		System.out.print("Nhap bao nhieu dong vat: "); int nnew = sc.nextInt();
		for(int i = n; i<n+nnew; i++) {
			System.out.println("Nhap vao dong vat thu "+(i+1));
			System.out.print("Chon loai dong vat {0(Bo), 1(Heo), 2(De), 3(Ga)}: "); c = sc.nextInt();
			switch(c) {
				case 0: 
					list[i] = new Bo();
					list[i].nhap();
					break;
				case 1:
					list[i] = new Heo();
					list[i].nhap();
					break;
				case 2:
					list[i] = new De();
					list[i].nhap();
					break;
				case 3:
					list[i] = new Ga();
					list[i].nhap();
					break;
				default:
					System.out.println("Khong ton tai!");
			}
		}
		for(int i = 0; i<n+nnew; i++) {
			list[i].Keu();
		}
	}
}
