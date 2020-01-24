import java.util.Scanner;

public class Formula{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int r;
	int diameter;
	double circumference;
	double area;
	double pi = 3.14159;
	
	System.out.print("Enter radius: ");
	r = input.nextInt();

	diameter = 2 * r;
	circumference = 2 * pi * r;
	area = pi * r * r;


	System.out.printf("The answer is %d%n %f%n %f%n", diameter, circumference, area);



}


}
