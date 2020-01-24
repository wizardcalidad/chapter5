package mileAge;
import java.util.Scanner;

public class MileAgeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int mile = 0;
		int gallon = 0;
		int totalMile = 0;
		int gallonCounter = 0;
		
		
		System.out.println("Enter number of miles travelled or press -1 to cancel: ");
		mile = input.nextInt();
		
		while(mile != -1) {
			System.out.println("Enter number of gallon used: ");
			gallon = input.nextInt();
			
			gallonCounter = gallonCounter + gallon;
			
			double MilePerGallon = mile / gallon;
			System.out.printf("The miles per gallon is %.2f%n", MilePerGallon);
			
			System.out.println("Enter number of miles travelled or -1 to cancel: ");
			mile = input.nextInt();
			
			totalMile += mile;
			
			
			
			counter++;
			
			
			
			
			}
		
		if(gallonCounter !=0) {
			
			System.out.printf("The total miles travelled is: %d%n", totalMile);
			System.out.printf("The total gallon used is: %d%n", gallonCounter);
			
			
			double totalMilePerGallon = totalMile / gallonCounter;
			System.out.printf("The total mileAge is: %.2f%n", totalMilePerGallon);
		}
	}

}
