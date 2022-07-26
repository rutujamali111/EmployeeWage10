
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		EmployeeWage wipro=new EmployeeWage(30,25,140);
		int total_wipro_wg=wipro.Wge_calculator();
		System.out.println("Employee wage for Wipro is: "+total_wipro_wg);
		
		EmployeeWage tcs=new EmployeeWage(30,25,140);
		int total_tcs_wg=tcs.Wge_calculator();
		System.out.println("Employee wage for TCS is: "+total_tcs_wg);
		

	}

}
