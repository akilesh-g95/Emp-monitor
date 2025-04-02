package attendancefeature.EMPMonitor;

import java.util.Scanner;

public class numberisPalendrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : "); // 1991
		int number = sc.nextInt();

		int originalnumber = number;

		int revnumber = 0;

		while (number != 0) {

			int reminder = number % 10; // 1
			revnumber = (revnumber * 10) + reminder; // 199

			number = number / 10;// 1
		}

		if (originalnumber == revnumber) {
			System.out.println("Its a palendrome dude  "+revnumber);
		} else {
			System.out.println("Given number  is not palendrome  " +revnumber);
		}

	}

}
