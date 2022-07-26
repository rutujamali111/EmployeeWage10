
public class EmployeeWage {
	public final int IS_PART_TIME=1;
	public final int IS_FULL_TIME=2;
	public int EMP_RATE_PER_HR;
	public int NUM_OF_WORKING_DAYS;
	public int MAX_HRS_IN_MONTH;
 public EmployeeWage(int eMP_RATE_PER_HR, int nUM_OF_WORKING_DAYS,
			int mAX_HRS_IN_MONTH) {
		super();
		EMP_RATE_PER_HR = eMP_RATE_PER_HR;
		NUM_OF_WORKING_DAYS = nUM_OF_WORKING_DAYS;
		MAX_HRS_IN_MONTH = mAX_HRS_IN_MONTH;
	}
public  int Wge_calculator()
 {
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
	{
			totalWorkingDays++;
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		switch(empCheck)
		{
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
		}
		totalEmpHrs+=empHrs;
		
	}
   int totalempWage=totalEmpHrs*EMP_RATE_PER_HR;
  

	return totalempWage;
	 
 }

}
