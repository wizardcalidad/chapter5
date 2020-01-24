package mileAge;

import java.util.Scanner;

public class mileAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int mile = 0;
		int gallon = 0;
		int totalMile = 0;
		int gallonCounter = 0;
		
		while(counter <= 10) {
			System.out.println("Enter number of miles travelled: ");
			mile = input.nextInt();
			
			System.out.println("Enter number of gallon used: ");
			gallon = input.nextInt();
			
			totalMile += mile;
			gallonCounter = gallonCounter + gallon;
			
			double MilePerGallon = mile / gallon;
			System.out.printf("The miles per gallon is %.2f%n", MilePerGallon);
			
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
