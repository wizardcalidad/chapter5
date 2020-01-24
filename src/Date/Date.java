import java.util.Scanner;


public class Date{

			private int month;
			private int day;
			private int year;
			private int displayDate;

	public Date(int month, int day, int year){
			this.month = month;
			this.day = day;
			this.year = year;
	}

	public void setMonth(int month){
		if(month <= 12)
			if(month > 0)
			this.month = month;
	
	}

	public int getMonth(){
		
		return month;
	}

	public void setDay(int day){
		if(day <= 31)
			if(day >0)
		day = day;
		
	}
	
	public int getDay(){
		return day;
	}

	public void setYear(int year){
		if(year >= 1000)
			year = year;
		
	}

	public int getYear(){
		return year;
	} 

	public void displayDate(){
		Scanner input = new Scanner(System.in);
		this.displayDate = displayDate;

		System.out.println("Enter month: ");
		month = input.nextInt();
		System.out.println("Enter the day of the month: ");
		day = input.nextInt();
		System.out.println("Enter the year: ");
		year = input.nextInt();

		System.out.printf("The date is %d %d %d%n", month, day, year);


	}


}