package attendancefeature.EMPMonitor;

import java.util.Scanner;

public class Digitcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int digitcount=0;
		
		while(num>0) {
			digitcount++;
			num= num/10;
		}

		System.out.println(digitcount);
	}

}
