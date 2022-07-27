
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.addCompany("Microsoft", 4, 30, 100);
        employeeWageComputation.addCompany("Google", 5, 40, 170);
        employeeWageComputation.addCompany("Amazon", 19, 10, 150);
        employeeWageComputation.calculateTotalWage();

	}

}
