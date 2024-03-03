package lab2;

import java.util.Scanner;
import java.util.Calendar;
import java.util.TimeZone;

public class Date {
	//Attributes
	private int ngay,thang,nam;
	//Constructors
	public Date() {
		//Get current date via Calendar class.
		Calendar d = Calendar.getInstance(TimeZone.getDefault());
		ngay = d.get(Calendar.DATE);
		thang = d.get(Calendar.MONTH) + 1;
		nam = d.get(Calendar.YEAR);
	}
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	//Methods
	public int getDay() {
		return ngay;
	}
	public int getMonth() {
		return thang;
	}
	public int getYear() {
		return nam;
	}
	public void setDay(int ngay) {
		this.ngay = ngay;
	}
	public void setMonth(int thang) {
		this.thang = thang;
	}
	public void setYear(int nam) {
		this.nam = nam;
	}
	public void setDate(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public void hienThi() {  
		System.out.print(ngay+"/"+thang+"/"+nam);
	}
	public String toString() {
		return ngay+"/"+thang+"/"+nam;
	}
	public void nhapDate() {
		Scanner sc = new Scanner(System.in);
		String date, month, year;
		boolean flag = false;
		do {
			System.out.print("Nhap ngay: "); date = sc.next();
			System.out.print("Nhap thang: "); month = sc.next();
			System.out.print("Nhap nam: "); year = sc.next();
			try {
				ngay = Integer.parseInt(date);
				thang = Integer.parseInt(month);
				nam = Integer.parseInt(year);
				if(!hopLe()) {
					flag = true;
					System.out.println("Ngay thang nam khong hop le, vui long nhap lai");
				}
				else {
					flag = false;
				}
			}catch(Exception e) {
				System.out.println("Sai dinh dang, vui long nhap lai");
				flag = true;
			}
		}while(flag == true);
	}
		
	
	public boolean namNhuan() {
		if((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)) {
			return true;
		}
		return false;
	}
	
	public boolean hopLe() {
		boolean valid = true;
		if((ngay < 1) || (ngay > 31) || (thang < 1) || (thang > 12) || (nam < 1)) {
			valid = false;
		}
		else {
			//Check for months that has 30 days or less
			switch(thang) {
				case 2:
					//Leap year
					if(namNhuan()) {
						if(ngay > 29) {
							valid = false;
						}
					}
					else {
						if(ngay > 28) {
							valid = false;
						}
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					//30 days
					if(ngay > 30) {
						valid = false;
					}
					break;
			}
		}
		return valid;
	}
	
	public Date ngayHomSau() {
		// d will be current date
		Date d = new Date(ngay,thang,nam);
		
		// day increment.
		d.ngay ++;
		// check month
		switch(d.thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				if(d.ngay > 31) {
					d.ngay = 1;
					d.thang ++;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(d.ngay > 30) {
					d.ngay = 1;
					d.thang++;
				}
				break;
			case 2:
				if(namNhuan()) {
					if(d.ngay > 29) {
						d.ngay = 1;
						d.thang++;
					}
				}
				else {
					if(d.ngay > 28) {
						d.ngay = 1;
						d.thang++;
					}
				}
				break;
			case 12:
				if(d.ngay > 31) {
					d.ngay = 1;
					d.thang = 1;
					d.nam++;
				}
				break;
		}
		return d;
	}
	
	public Date congNgay(int n) {
		Date d = new Date(ngay,thang,nam);
		for(int i = 0; i<n; i++) {
			d = d.ngayHomSau();
		}
		return d;
	}
}
