package lab1;

import java.util.Scanner;
import java.util.Arrays;

public class bai8 {
	public void nhapDS(int list[]) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<list.length; i++) {
			 list[i] = sc.nextInt();
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
		bai8 p = new bai8();
		System.out.print("Nhap n so vao danh sach: "); int n = sc.nextInt();
		int list[] = new int[n];
		p.nhapDS(list);
		System.out.print("Nhap so can kiem tra: "); int x = sc.nextInt();
		System.out.println(p.countNum(x,list)+" lan da tim thay so "+x+" trong danh sach");
		p.sort(list,list.length);
		System.out.println("After sorting:");
		p.in(list);
	}
}
