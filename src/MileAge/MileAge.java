import java.util.Scanner;


public class MileAge{
	private int trip;
	private double totalMilesPerGalon;

	public MileAge(int trip){
		this.trip = trip;
		this.totalMilesPerGalon = totalMilesPerGalon;
	}
	Scanner input = new Scanner(System.in);
	public void processTrip(){
		System.out.print("Enter number of galons: ");
		int galon = input.nextInt();
		System.out.print("Enter number of miles travelled: ");
		int miles = input.nextInt();
		double milesPerGalon = miles / galon;
		totalMilesPerGalon = milesPerGalon + 1;
		System.out.printf("The milesPerGalon is %d%n, The total Miles Per Galon is %d%n", milesPerGalon, totalMilesPerGalon);
	}
	public void initiate(){
		for( int i = 0; i<this.trip; i++ ){
		 processTrip();
		}
	}
	

}
