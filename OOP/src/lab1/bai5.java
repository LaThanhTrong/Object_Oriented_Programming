package lab1;

public class bai5 {
	public static void ptb1(double a, double b) {
		double x;
		System.out.println("Phuong trinh bac mot co dang: " + a + "x + " + b + " = 0");
		if(a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		}
		else if(a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		else if(a != 0) {
			x = -b/a;
			System.out.println("Phuong trinh co nghiem duy nhat x = "+x);
		}
	}
	
	public static void ptb2(double a, double b, double c) {
		double x1,x2,delta;
		System.out.println("Phuong trinh bac hai co dang: " + a + "x^2 + " + b + "x + " + c + " = 0");
		delta = Math.pow(b, 2) - 4 * a * c; 
		if(delta < 0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		else if(delta == 0) {
			x1 = -b/(2.0*a);
			x2 = -b/(2.0*a);
			System.out.println("Phuong trinh co nghiem duy nhat x1 = x2 = "+x1);
		}
		else {
			x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + ", x2 = " + x2);
		}
	}
}
