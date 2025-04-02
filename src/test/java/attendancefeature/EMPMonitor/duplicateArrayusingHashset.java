package attendancefeature.EMPMonitor;

import java.util.HashSet;
import java.util.Set;

public class duplicateArrayusingHashset {

	public static void main(String[] args) {
		Object []a = {"Java", "OOPS", "coffee", "Java"};

		Set<Object> set = new HashSet<Object>();
		for (int i=0; i<a.length; i++) {
			if(set.add(a[i])==false) {
				System.out.println(a[i]+" is Duplicated");
			
			}
		}
	}

}
