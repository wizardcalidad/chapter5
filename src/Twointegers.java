import java.util.Scanner;

public class Twointegers{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int a;
	int b;
	int result;

	System.out.print("Enter first integer: ");
	a = input.nextInt();

	System.out.print("Enter second integer: ");
	b = input.nextInt();

	result = a * b;
	System.out.printf("The answer is %d%n", result);
	result = a + b;
	System.out.printf("The answer is %d%n", result);
	result = a / b;
	System.out.printf("The answer is %d%n", result);
	result = a % b;
	System.out.printf("The answer is %d%n", result);
	
}

}
