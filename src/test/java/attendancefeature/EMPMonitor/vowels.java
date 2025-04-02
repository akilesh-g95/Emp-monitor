package attendancefeature.EMPMonitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text : ");
		String str = sc.nextLine();
		
		char[] addedText = str.toCharArray();
		
		Map<Character, Integer> m=new HashMap<Character, Integer>();
	
		char []vowel = {'a','e','i','o','u'};
		
		for (char storingvowelintomap : vowel) {
			m.put(storingvowelintomap, 0);
		}
		
		for (char storingaddedtext : addedText) {
			if(m.containsKey(storingaddedtext)) {
				m.put(storingaddedtext, m.get(storingaddedtext)+1);
			}
		}
		System.out.println("Vowels Count");
		for (char ch : vowel) {
			System.out.println(ch+" : "+ m.get(ch));
		}
	}
}
