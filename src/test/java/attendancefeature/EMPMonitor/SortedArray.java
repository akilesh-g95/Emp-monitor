package attendancefeature.EMPMonitor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortedArray {

	public static void main(String[] args) {
	int []a= {1,1,2,3,3,4,5,5,6,6,6,7,8,8,9}; //15-1=14

	int j=0;
	for(int i=0; i<a.length-1; i++) {  //i=1, 
		if(a[i]!= a[i+1]) {     //1 != 2
			a[j]=a[i];          //a[j] =1 
			j++;            //0+1=1
		}
	}
		a[j]=a[a.length-1];
		for(int k=0; k<=j; k++) {
			System.out.println(a[k]+"");
		
	}
}}
