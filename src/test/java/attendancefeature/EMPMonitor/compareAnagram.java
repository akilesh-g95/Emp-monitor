package attendancefeature.EMPMonitor;

import java.util.Arrays;
import java.util.Scanner;

public class compareAnagram {

	public static boolean testanagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		System.out.println("Before Sorting str 1 -> " + Arrays.toString(ch1));
		Arrays.sort(ch1);
		System.out.println("After sorting str 1 -> " + Arrays.toString(ch1));

		System.out.println("Before Sorting str 2-> " + Arrays.toString(ch2));
		Arrays.sort(ch2);
		System.out.println("After sorting str 2-> " + Arrays.toString(ch2));

		return Arrays.equals(ch1, ch2);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String : ");
		String str2 = sc.nextLine();
		sc.close();

		if (testanagram(str1, str2)) {
			System.out.println("The given strign are Anagram");
		} else {
			System.out.println("not a Anagram");
		}
	}

}
