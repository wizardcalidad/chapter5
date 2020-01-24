public class Employee{
		private String firstName;
		private String lastName;
		private double monthlySalary;
		private double yearlySalary;

	public Employee(String fName,String lName,double mSal){
				firstName = fName;
				lastName = lName;
				monthlySalary = mSal;

	} 

	public void setFirstName(String fName){
		firstName = fName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lName){
		lastName = lName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setMonthlySalary(double mSal){
		if (monthlySalary >= 0.0 ) {
			monthlySalary = mSal;
		}
		else{}
	}

	public double getMonthlySalary(){
			return monthlySalary;
	}

	public void setYearlySalary(){
			this.yearlySalary = 12 * monthlySalary;
	}

	public double getYearlySalary(){
		return yearlySalary;
	}
	public double getTenPercent(){
		double TenPercentIncrement = 1.1 * yearlySalary;
		return TenPercentIncrement;
	}

}