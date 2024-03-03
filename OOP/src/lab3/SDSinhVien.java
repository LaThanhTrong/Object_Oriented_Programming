package lab3;
import java.util.Scanner;
public class SDSinhVien {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		/*
		SinhVien a = new SinhVien();
		a.nhap();
		System.out.print("Thong tin sinh vien a: "+a);
		System.out.print("\n");
		a.dangKy();s
		System.out.print("\n");
		a.in();
		*/
		do {
			System.out.print("Nhap so luong sinh vien: "); n = sc.nextInt();
		}while(n < 0);
		/*
		LinkedList list = new LinkedList();
		for(int i = 0; i<n; i++) {
			System.out.print("\nNhap thong tin sinh vien thu "+(i+1)+":\n");
			SinhVien sv = new SinhVien();
			sv.nhap();
			sv.dangKy();
			sv.nhapDiem();
			list.insert(sv);
		}
		list.show();
		
		System.out.print("Danh sach sinh vien bi canh bao hoc vu:\n");
		list.showCanhCaoHocVu();
		*/
		
		SinhVien ds[] = new SinhVien[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap thong tin sinh vien thu "+(i+1)+":\n");
			ds[i] = new SinhVien();
			ds[i].nhap();
			ds[i].dangKy();
			ds[i].nhapDiem();
		}
		for(int i = 0; i < n; i++) {
			System.out.print("Thong tin sinh vien thu "+(i+1)+":\n"); ds[i].in();
			System.out.print("\n");
		}
		System.out.print("Danh sach sinh vien bi canh bao hoc vu:\n");
		for(int i = 0; i < n; i++) {
			if(ds[i].diemtBinh() < 1) {
				System.out.print(ds[i]+" Diem trung binh: "+ds[i].diemtBinh());
				System.out.print("\n");
			}
		}
		
		for(int i = 0; i < ds.length; i++) {
			for(int j = i+1; j < ds.length; j++) {
				if(ds[i].diemtBinh() > ds[j].diemtBinh()) {
					SinhVien temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		System.out.print("Sinh vien co diem trung binh cao nhat lop:\n"+ds[n-1]+" Diem trung binh: "+ds[n-1].diemtBinh());
		System.out.print("\nSau khi sap xep danh sach sinh vien theo thu tu alphabet theo ten:\n");
		for(int i = 0; i < ds.length; i++) {
			for(int j = i+1; j < ds.length; j++) {
				if(ds[i].getName().compareTo(ds[j].getName()) > 0) {
					SinhVien temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print("Thong tin sinh vien thu "+(i+1)+":\n"); ds[i].in();
			System.out.print("\n");
		}
	}
}
