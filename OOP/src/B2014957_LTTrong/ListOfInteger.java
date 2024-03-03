package B2014957_LTTrong;

import java.util.Scanner;

public class ListOfInteger {
	public void nhap(int[] list){
        Scanner sc = new Scanner(System.in);
        String num;
        int convert = 0;
        boolean flag = false;
        for(int i = 0; i<list.length; i++){
            /*Check for error*/
            do{
                num = sc.next();
                try{
                    convert = Integer.parseInt(num);
                    flag = false;
                }catch(NumberFormatException e){
                    flag = true;
                    System.out.println("Nhap sai dinh dang, yeu cau nhap lai!");
                }
            }while(flag == true);
            list[i] = convert;
        }
    }
	
	public void in(int list[]) {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
	
	public int countNum(int x, int list[]) {
		int count = 0;
		for(int i = 0; i<list.length; i++) {
			if(list[i] == x) {
				count++;
			}
		}
		return count;
	}
	
	public void sort(int list[], int length) {
		if(list.length == 1) {
			return;
		}
		int mid = list.length / 2;
		int pLeft = mid;
		int pRight = list.length - mid;
		int left[] = new int[pLeft];
		int right[] = new int[pRight];
		for(int i = 0; i<mid; i++) {
			left[i] = list[i];
		}
		for(int i = mid; i<=list.length-1; i++) {
			right[i-mid] = list[i];
		}
		sort(left,mid);
		sort(right,list.length-mid);
		int i = 0, j = 0, k = 0;
		while(i<pLeft && j<pRight) {
			if(left[i] <= right[j]) {
				list[k] = left[i];
				k++;
				i++;
			}
			else {
				list[k] = right[j];
				k++;
				j++;
			}
		}
		while(i<pLeft) {
			list[k] = left[i];
			i++;
			k++;
		}
		while(j<pRight) {
			list[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListOfInteger p = new ListOfInteger();
		System.out.print("Nhap n so vao danh sach: "); int n = sc.nextInt();
		int list[] = new int[n];
		p.nhap(list);
		System.out.print("Nhap so can kiem tra: "); int x = sc.nextInt();
		System.out.println("So "+x+" da tim thay "+p.countNum(x, list)+" lan trong danh sach");
		p.sort(list,list.length);
		System.out.println("After sorting:");
		p.in(list);
	}
}
