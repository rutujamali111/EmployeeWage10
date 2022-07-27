
public class EmployeeWage {
	public String COMPANY_NAME;
	public final int IS_PART_TIME=1;
	public final int IS_FULL_TIME=2;
	public int EMP_RATE_PER_HR;
	public int NUM_OF_WORKING_DAYS;
	public int MAX_HRS_IN_MONTH;
	int totalEmpWage;
 public EmployeeWage(String company_name,int eMP_RATE_PER_HR, int nUM_OF_WORKING_DAYS,
			int mAX_HRS_IN_MONTH) {
		super();
		COMPANY_NAME=company_name;
		EMP_RATE_PER_HR = eMP_RATE_PER_HR;
		NUM_OF_WORKING_DAYS = nUM_OF_WORKING_DAYS;
		MAX_HRS_IN_MONTH = mAX_HRS_IN_MONTH;
		totalEmpWage=0;
	}
 void setTotalEmployeeWage(int totalEmpWage) 
 {
     this.totalEmpWage = totalEmpWage;
 }

public String toString() {
    System.out.println("Details of " + COMPANY_NAME + " employee");
    System.out.println("-----------------------------------------------------");
    System.err.println("Wage per hour:" + EMP_RATE_PER_HR);
    System.out.println("Maximum working days:" + NUM_OF_WORKING_DAYS);
    System.out.println("Maximum working hours:" + MAX_HRS_IN_MONTH);
    return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalEmpWage + "\n";
}


}
