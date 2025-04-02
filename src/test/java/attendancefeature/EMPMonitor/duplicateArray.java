package attendancefeature.EMPMonitor;

import java.util.Iterator;

public class duplicateArray {

	public static void main(String[] args) {

		int[] a = { 3, 4, 5, 6, 5, 4, 3, 7, 7, 9 };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[i] + " is a Duplicate value");
				}
			}
		}
	}

}
