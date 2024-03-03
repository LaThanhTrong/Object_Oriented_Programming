package lab1;
import java.util.Scanner;
public class bai7 {
	
	public String split_name(String name) {
		name = name.trim();
		int index = name.lastIndexOf(" ");
		String convert = name.substring(index+1);
		return convert;
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bai7 p = new bai7();
		System.out.print("Nhap ho va ten: "); String name = sc.nextLine();
		sc.close();
		System.out.println("Sau khi tach ten: "+p.split_name(name));
		
	}

}
