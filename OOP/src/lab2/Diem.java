package lab2;

import java.util.Scanner;

public class Diem {
	//Encapsulation has attributes and method
	//Attributes
	private int x, y;
	//Create constructors
	public Diem(){
		//Initiate value
		x = 0;
		y = 0;
	}
	public Diem(int x, int y) {
		//Value on demand
		this.x = x;
		this.y = y;
	}
	public Diem(Diem d) {
		this.x = d.x;
		this.y = d.y;
	}
	public Diem(int n) {
		x = n;
		y = n;
	}
	//Methods
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hoanh do x: "); x = sc.nextInt();
		System.out.print("Nhap tung do y: "); y = sc.nextInt();
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public void hienThi() { //(x,y)
		System.out.print("("+x+","+y+")");
	}
	//Extra method.
	public void gan(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void ganX(int x) {
		this.x = x;
	}
	public void ganY(int y) {
		this.y = y;
	}
	
	public void doiDiem(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public int giaTriX() {
		return x;
	}
	
	public int giaTriY() {
		return y;
	}
	
	public float khoangCach() { //(x,y) -> 0 => sqrt(x^2 + y+2)
		return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public float khoangCach(Diem d) { //(x,y) -> d => sqrt( (x-d.x)^2 + (y-d.y)^2 )
		return (float) Math.sqrt(Math.pow(x-d.x, 2)+Math.pow(y-d.y, 2)); 
	}
}

