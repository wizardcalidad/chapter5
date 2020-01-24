import java.util.Scanner;

public class classAvg{
	private int total;
	private int gradeCounter;
	private double classAverage;

	public classAvg(int total, int gradeCounter){
		this.total = total;
		total = 0;
		this.gradeCounter = gradeCounter;
		gradeCounter= 0;
	}

	public void classav(){
		
	Scanner input = new Scanner(System.in);

		while(gradeCounter <= 10){
		System.out.print("Enter the next grade: ");
		int grade = input.nextInt();

		total = total + grade;
		gradeCounter = gradeCounter + 1;
		}

		double classAverage = total / 10;

		System.out.printf("The class average of junior achievers 2 is %.4f%n", classAverage); 
	
}

	//public double getClassav(){
	//	return classAverage;
		
	//}

}