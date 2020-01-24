import java.util.Scanner;

public class HeartRates{
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private int age;
	private double maximumHeartRate;
	private double targetHeartRate;

	Scanner input = new Scanner(System.in);

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setDateOfBirth(){
		System.out.print("Enter your year of birth: ");
		this.dateOfBirth = input.nextInt(); 
	}
	public int getDateOfBirth(){
		return dateOfBirth;
	}
	public void setAge(){
		this.age = 2020 - dateOfBirth;

	}
	public int getAge(){
		return age;
	}
	public void setTargetHeartRate(){
		age = getAge();
		maximumHeartRate = 220 - (age * 0.7);
		targetHeartRate = (maximumHeartRate * 0.5) + 63;
	}
	public double getTargetHeartRate(){
		return targetHeartRate;
	}


}