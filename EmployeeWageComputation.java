import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWageComputation {
	 public static final int PART_TIME = 1;
	    public static final int FULL_TIME = 2;
	    

	    
	    ArrayList<EmployeeWage> companies;
	    
	    HashMap<String, Integer> totalEmpWages;

	   
	    public EmployeeWageComputation() 
	    {
	        companies = new ArrayList<>();
	        totalEmpWages = new HashMap<>();
	    }

	    
	    int generateEmployeeType() 
	    {
	        return (int) (Math.random() * 100) % 3;
	    }

	    int getWorkingHrs(int empType) 
	    {
	        switch (empType) 
	        {
	            case FULL_TIME:
	                return 8;
	            case PART_TIME:
	                return 4;
	            default:
	                return 0;
	        }
	    }

	    public void calculateTotalWage() 
	    {
	        for (EmployeeWage company : companies) 
	        {
	            int totalWage = calculateTotalWage(company);
	            company.setTotalEmployeeWage(totalWage);
	            System.out.println(company);
	        }
	    }

	    int calculateTotalWage(EmployeeWage companyEmpWage) 
	    {
	        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee");
	        System.out.println("-----------------------------------------------------");
	        System.out.printf("%4s\t%4s\t%2s\t%4s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

	        int workingHrs, totalWage = 0;
	        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_HRS_IN_MONTH
	                && totalWorkingHrs <= companyEmpWage.MAX_HRS_IN_MONTH; day++, totalWorkingHrs += workingHrs) 
	        {
	            int empType = generateEmployeeType();
	            workingHrs = getWorkingHrs(empType);
	            int wage = workingHrs * companyEmpWage.EMP_RATE_PER_HR;
	            totalWage += wage;
	            System.out.printf("%4d\t%5d\t%10d\t%10d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
	        }
	        totalEmpWages.put(companyEmpWage.COMPANY_NAME, totalWage);
	        return totalWage;
	    }

	    }
