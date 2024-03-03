package B2014957_LTTrong;

import java.util.Scanner;

public class CutName {
	public String cut_name(String name) {
		name = name.trim();
		int index = name.lastIndexOf(" ");
		String convert = name.substring(index+1);
		return convert;
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CutName p = new CutName();
		System.out.print("Nhap ho va ten: "); String name = sc.nextLine();
		System.out.println("Sau khi tach ten: "+p.cut_name(name));
		
	}
}
