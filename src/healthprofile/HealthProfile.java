import java.util.Scanner;

public class HealthProfile{
	private String firstName;
	private String lastName;
	private String gender;
	private int month;
	private int day;
	private int year;
	private double height;
	private double weight;
	//private String newGender;

	Scanner input = new Scanner(System.in);

	public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.month = month;
		this.day = day;
		this.year = year;
		this.height = height;
		this.weight = weight;
	}
	public void setFirstName(){
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(){
		System.out.print("Enter last name: ");
		String lastName = input.nextLine();
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public int setmGender(){
		System.out.print("Press 1 for Male and 2 for female: ");
		int mygender = input.nextInt();	
		return mygender;
	}
	
	public String getGender(int mygender){
		String gender = "";
			if(mygender ==1)
			gender = "Male";
		if(mygender ==2)
			gender = "Female";
		return gender;
	}
	public void setMonth(){
		System.out.print("Enter your month of birth: ");
		month = input.nextInt();
		this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(){
		System.out.print("Enter the day: ");
		day = input.nextInt();
		this.day = day;
	}
	public int getDay(){
		return day;
	}
	public void setYear(){
		System.out.print("Enter the year: ");
		year = input.nextInt();
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	public void setHeight(){
		System.out.print("Enter your height: ");
		height = input.nextDouble();
			this.height = height;
	}
	public double getHeight(){
		return height;
	}
	public void setWeight(){
		System.out.print("...and your weight: ");
		weight = input.nextDouble();
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	public int calculateAge(){
			int age = 2020 - year;
			return age;
	}


}
