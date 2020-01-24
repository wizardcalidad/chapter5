import java.util.Scanner;

public class Dcac{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.print("Enter the radius of the circle: ");
	double rad = input.nextDouble();

	double pi = 3.14159;

	double diameter = 2 * rad;	
	double circumference = 2 * pi * rad;
	double area = pi * rad * rad;
	
	System.out.printf("The diameter of the circle is %f%n", diameter);
	System.out.printf("The circumference of the circle is %f%n", circumference);
	System.out.printf("The area of the circle is %f%n", area);
}

  }
