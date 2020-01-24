public class EmployeeTest{

	public static void main(String[] args) {
		
		Employee workerOne = new Employee("Wizard", "Calidad", 56000000.0);
		Employee workerTwo = new Employee("Qoyum", "Yusuf", 40000000.0);

		workerOne.setYearlySalary();
		workerTwo.setYearlySalary();

		System.out.printf("%s %s is earning nothing less than %.1f million naira in a month%n",workerOne.getFirstName(), workerOne.getLastName(), workerOne.getMonthlySalary());
		System.out.printf("%s %s salary per annum is: %.1f%n and his ten percent increment is: %.2f%n", workerOne.getFirstName(), workerOne.getLastName(), workerOne.getYearlySalary(), workerOne.getTenPercent());
		System.out.printf("%s %s salary per annum is: %.1f%n and his ten percent increment is: %.2f%n", workerTwo.getFirstName(), workerTwo.getLastName(), workerTwo.getYearlySalary(), workerTwo.getTenPercent());

	}
}