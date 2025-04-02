package attendancefeature.EMPMonitor;

public class prac2 {

	public static void main(String[] args) {
		
		String []list = {"abc", "bca", "cbc", "abc","cac", "abc"			};
		
		System.out.println("Length of array is ===" + list.length);
		for(int i=0; i<list.length-1; i++) { // 0 
			for(int j=i+1; j<list.length; j++) { //1 
				
				if(list[i]==list[j]) {
					System.out.println("Duplicate element found -->"+list[j]);
				}else {
					System.out.println("No duplicate element found ---> "+ list[j]);
				}
			}
		}

	}

}
