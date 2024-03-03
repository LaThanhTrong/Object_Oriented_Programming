package lab3;

public class LinkedList {
	private SinhVien header;
	public LinkedList() {
		header = new SinhVien();
		header.next = null;
	}
	public void insert(SinhVien s) {
		SinhVien temp = header;
		s.next = temp.next;
		temp.next = s;
	}
	public void delete() {
		SinhVien temp = header;
		if(temp.next != null) {
			temp.next = temp.next.next;
		}
	}
	public void show() {
		SinhVien temp = header;
		while(temp.next != null) {
			temp.next.in();
			System.out.print("\n");
			temp = temp.next;
		}
	}
	public void showCanhCaoHocVu() {
		SinhVien temp = header;
		while(temp.next != null) {
			if(temp.next.diemtBinh() < 1) {
				temp.next.in();
				System.out.print("\n");
			}
			temp = temp.next;
		}
	}
}
