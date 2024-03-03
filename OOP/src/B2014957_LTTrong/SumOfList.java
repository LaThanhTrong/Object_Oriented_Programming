package B2014957_LTTrong;

public class SumOfList {
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
		System.out.println("\nSo lon nhat: "+max);
		System.out.println("Tong: "+sum);
	}
}
