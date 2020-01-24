/*import java.util.Scanner;

public class LargeNumber{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int x;
	int y;
	int z;
	int result1;
	int result2;
	int result3;   

	System.out.println("Input your first value: ");
	x = input.nextInt();

	System.out.println("Input your second value: ");
	y = input.nextInt();

	System.out.println("Input your third value: ");
	z = input.nextInt();

	result1 = x + y + z;
	result2 = (x + y + z)/2;
	result3 = x * y * z;
	System.out.printf("The sum is %d%nThe average is %d%nThe product is %d%n",result1, result2, result3);

	System.out.println();

	//if (x > y && y > z){
	//System.out.printf("%d is the largest number %n",x);
	//}

	//if (y > z && z > x){
	//System.out.printf("%d is the largest number %n",y);
	//}

	//if (z > x && x > y){
	//System.out.printf("%d is the largest number %n",z);
	//}

	//if (x < y && y < z){
	//System.out.printf("%d is the smallest number %n", x);
	//}

	//if (y < z && z < x){
	//System.out.printf("%d is the smallest number %n",y);
	//}

	//if (z < x && x < y){
	//System.out.printf("%d is the smallest number %n", z);
	//}
}
} */

import java.util.Scanner;

public class LargeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     

    System.out.println("Enter first number: ");
    int x = input.nextInt();
    
    System.out.println("Enter first number: ");
    int y = input.nextInt();
    

    System.out.println("Enter first number: ");
    int z = input.nextInt();
    

     int sum = x + y + z;
     int ave =  (x + y + z)/2;
     
    
     
    System.out.printf("The sum is : %d%n",
       sum);   
     
    
    System.out.printf("The average is : %d%n%n",
       ave);
    

      if (x > y && x > z) {
	System.out.printf("%d is the largest number %n",x);
	}

     if (y > z && y > x) {
	System.out.printf("%d is the largest number %n",y);
	}

     if (z > x && z > y) {
	System.out.printf("%d is the largest number %n",z);
	} else {
        System.out.printf("error");

        }

        
    
      
     if (x < y && y < z) {
	System.out.printf("%d is the smallest number %n", x);
	}

     if (y < z && z < x) {
	System.out.printf("%d is the smallest number %n",y);
	}

     if (z < x && x < y) {
	System.out.printf("%d is the smallest number %n", z);
	}
  }
  
}
