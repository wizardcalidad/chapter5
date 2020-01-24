public class HealthPTest{
	public static void main(String[] args) {
		HealthProfile Man = new HealthProfile("John", "Doe", "Male", 12, 23, 2019, 0.0, 0.0);
		
		Man.setFirstName();
		Man.setLastName();
		Man.setMonth();
		Man.setmGender();
		Man.getGender();
		Man.setDay();
		Man.setYear();
		Man.setHeight();
		Man.setWeight();
		//Man.setNewGender();
		//Man.calculateAge();
		System.out.println("");
		System.out.println("Hello buddy! This is your health profile for today");
		System.out.printf("Your name is %s %s%n", Man.getFirstName(), Man.getLastName());
		//Man.setGender();
		System.out.printf("You are a %s%n", Man.getGender());

		System.out.printf("Your Date of Birth is %d/%d/%d%n", Man.getMonth(), Man.getDay(), Man.getYear());
		System.out.printf("Your height is %.2fmeters%n your weight is %.2fkg%n ", Man.getHeight(), Man.getWeight());
 
	
	}
}
