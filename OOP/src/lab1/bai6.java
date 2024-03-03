package lab1;
import java.util.Scanner;
import java.util.Stack;
public class bai6 {

	public boolean isPrime(int n) {
		if(n > 1) {
			for(int i = 2; i<n; i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public void d2b(int n) {
		Stack<Integer> st = new Stack<>();
		int remain;
		int temp = n;
		while(temp != 0) {
			remain = temp % 2;
			st.push(remain);
			temp = temp / 2;
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}
	
	public String d2b_2(int n) {
		String binary = "";
		while(n>0) {
			binary = (n % 2) + binary;
			n = n / 2;
		}
		return binary;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bai6 p = new bai6();
		System.out.print("Nhap vao 1 so: "); int n = sc.nextInt();
		sc.close();
		if(p.isPrime(n)) {
			System.out.print("This is a prime number");
		}
		else {
			System.out.print("This isn't a prime number");
		}
		System.out.print("\nAfter convert to binary: ");
		p.d2b(n);
		System.out.print("\nAfter convert to binary version 2: "+p.d2b_2(n));
	}

}
