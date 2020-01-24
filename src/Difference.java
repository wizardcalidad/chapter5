import java.util.Scanner;

public class Difference{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	double W;
	double h;
	double BMI;

	System.out.print("Enter value for your weight in kg: ");
	W = input.nextDouble();

	
	System.out.print("Enter value for your height in m: ");
	h = input.nextDouble();

	BMI = W / ( h * h);

	System.out.printf("Your BMI value is %.2f kg/squaremetre\n", BMI);


}

}
