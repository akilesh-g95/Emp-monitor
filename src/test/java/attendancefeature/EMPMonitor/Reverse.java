package attendancefeature.EMPMonitor;

public class Reverse {

	public static void main(String[] args) {
		String text = "Im A Bad Boy";
		String rev = "";
		
		System.out.println(text.length());
		for(int i=text.length()-1; i>=0; i--) {
			rev += text.charAt(i);
					
		}

		
	}

}
