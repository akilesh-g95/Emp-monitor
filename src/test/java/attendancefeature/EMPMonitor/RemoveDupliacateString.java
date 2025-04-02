package attendancefeature.EMPMonitor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupliacateString {

	public static void main(String[] args) {

		int a[] = { 5, 3, 4, 1, 3, 3, 4, 2, 4, 0, 9 };

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}

		Integer[] b = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(b));
	}

}
