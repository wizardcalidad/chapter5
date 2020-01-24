import java.util.Scanner;

public class DigitSep{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int a;
	int a1;
	int a2;
	int a3;
	int a4;
	int a5;

	System.out.print("Enter your five digits: ");
	a = input.nextInt();
	
	int b = (a%10000)%1000;

	a1= a / 10000;
	a2 = (a%10000)/1000;
	a3 = b/100;
	a4 = (b%100)/10;
	a5 = (b%100)%10;

	System.out.printf("%d   %d   %d   %d  %d%n", a1,a2,a3,a4,a5);
}

	}
