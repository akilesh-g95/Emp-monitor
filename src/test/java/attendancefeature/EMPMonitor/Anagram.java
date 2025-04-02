//package attendancefeature.EMPMonitor;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Anagram {
//	
//	
//	public static	boolean testanagram(String str1, String str2) {
//		str1 = str1.toLowerCase();
//		str2 = str2.toLowerCase();
//
//		if(str1.length()!=str2.length()) {
//			return false;
//		}
//		
//		char[] ch1 = str1.toCharArray();
//		char[] ch2 = str2.toCharArray();
//
//		System.out.println("Before Sorting str 1 -> " + ch1);
//		Arrays.sort(ch1);
//		System.out.println("After sorting str 1 -> " + ch1);
//
//		System.out.println("Before Sorting str 2-> " + ch2);
//		Arrays.sort(ch1);
//		System.out.println("After sorting str 2-> " + ch2);
//
//		return Arrays.equals(ch1, ch2);
//		
//	}
//
//	public  static void main(String[] args) {
//
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the First String : ");
//		String str1 = sc.nextLine();
//		System.out.println("Enter the Second String : ");
//		String str2 = sc.nextLine();
//		sc.close();
//
//		
//		if(testanagram(str1, str2)) {
//			System.out.println("The given strign are Anagram");
//		}else {
//			System.out.println("not a Anagram");
//		}
//	}
//	
//	
//	
//	
//		
//		
//	
//
//}
package attendancefeature.EMPMonitor;

import java.util.Arrays;
import java.util.Scanner;

public class  Anagram{
    public static boolean areAnagrams(String str1, String str2) {
        // Remove case sensitivity by converting to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();
        
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}