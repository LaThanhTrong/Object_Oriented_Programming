package lab1;
public class bai3 {

	public static void main(String[] args) {
		double sum = 0,n,max = Double.MIN_VALUE;
		for(String e : args) {
			try {
				n = Double.parseDouble(e);
			}catch(NumberFormatException x){
				System.out.print("Catch Exception: "+x);
				n = 0;
			}
			sum += n;
			if(max < n) {
				max = n;
			}
		}
		System.out.println("\nSố lớn nhất: "+max);
		System.out.println("Tổng: "+sum);
	}
}
