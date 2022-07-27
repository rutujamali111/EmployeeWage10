
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
		employeeWageComputation.addCompany("wipro",3,25,140);
		employeeWageComputation.addCompany("TCS", 4, 30, 100);
		employeeWageComputation.addCompany("Microsoft", 4, 30, 100);
        employeeWageComputation.addCompany("Google", 5, 40, 170);
        employeeWageComputation.addCompany("Amazon", 19, 10, 150);
        employeeWageComputation.calculateTotalWage();
        String query = "Google";
        int totalWage = employeeWageComputation.getTotalEmpWage(query);
        System.out.println("Total Employee Wage for " + query + " company is " + totalWage);
	}

}
