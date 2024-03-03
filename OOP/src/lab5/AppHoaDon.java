package lab5;

import java.io.IOException;
import java.util.Scanner;

public class AppHoaDon {
	
	public static void inteUI() {
		System.out.println("\t\t\t\t************ Chao mung den chuong trinh quan ly hoa don ************");
		System.out.println("\t\t\t\t0. Thoat chuong trinh");
		System.out.println("\t\t\t\t1. Nhap thong tin danh sach hoa don moi");
		System.out.println("\t\t\t\t2. In thong tin danh sach hoa don");
		System.out.println("\t\t\t\t3. Tinh doanh thu theo thang");
		System.out.println("\t\t\t\t4. Tinh doanh thu cua 1 san pham trong 1 thang");
		System.out.println("\t\t\t\t5. Tim kiem hoa don theo ma hoa don");
	}  
	public static void clrscr(){
		for(int i = 0; i<25; i++){
			System.out.println();
		}
	}

	public static void main(String[] args) {
		/*
		HoaDon hd = new HoaDon();
		System.out.println("\t\t\t\t************ Vui long nhap thong tin hoa don ************");
		hd.nhap();
		System.out.println("\n\t\t\t\t************ Thong tin hoa don ************");
		//hd.in();
		System.out.print(hd);
		*/
		/*
		DanhSachHoaDon ds = new DanhSachHoaDon();
		ds.nhap();
		ds.in();
		*/
		DanhSachHoaDon ds = new DanhSachHoaDon();
		int k = 0;
		int month = 1, year = 1;
		do {
			inteUI();
			Scanner sc = new Scanner(System.in);
			System.out.print("Vui long chon cong cu muon su dung: "); k = sc.nextInt();
			sc.nextLine();
			switch(k) {
				case 1:
					ds.nhap();
					System.out.print("Chuong trinh chay thanh cong! Bam phim Enter de tiep tuc: ");
					try {
						System.in.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 2:
					ds.in();
					System.out.print("\nChuong trinh chay thanh cong! Bam phim Enter de tiep tuc: ");
					try {
						System.in.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 3: 
					do {
						System.out.print("Nhap thang: "); month = sc.nextInt();
						System.out.print("Nhap nam: "); year = sc.nextInt();
					}while((month < 1 || month > 12) || year < 1);
					System.out.printf("Tong doanh thu theo %d nam %d: %.2f",month,year,ds.doanhThutheoThang(month, year));
					System.out.print("\nChuong trinh chay thanh cong! Bam phim Enter de tiep tuc: ");
					try {
						System.in.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 4:
					month = 1;
					year = 1;
					String item = new String();
					do {
						System.out.print("Nhap san pham: "); item = sc.nextLine();
						System.out.print("Nhap thang: "); month = sc.nextInt();
						System.out.print("Nhap nam: "); year = sc.nextInt();
						sc.nextLine();
					}while((month < 1 || month > 12) || year < 1);
					System.out.printf("Tong doanh thu %s theo thang %d nam %d: %.2f",item,month,year,ds.doanhThuSanPhamtheoThang(item, month, year));
					System.out.print("\nChuong trinh chay thanh cong! Bam phim Enter de tiep tuc: ");
					try {
						System.in.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 5:
					System.out.print("Nhap ma hoa don can tim kiem: "); String code = sc.nextLine();
					System.out.println("\n\t\t\t\t************ Thong tin hoa don ************");
					ds.findMaSo(code);
					System.out.print("\nChuong trinh chay thanh cong! Bam phim Enter de tiep tuc: ");
					try {
						System.in.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 0:
					try {
						System.out.print("System exit successfully!");
						System.exit(0);
					}catch(Throwable t) {
						System.out.print("System exit fail!");
						System.exit(1);
					}
			}
			clrscr();
		}while(k != 0);
	}
}
