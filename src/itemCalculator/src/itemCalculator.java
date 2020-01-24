import java.util.Scanner; public class itemCalculator { public static void main(String[] args) { Scanner input = new Scanner(input.in); int counter = 0; int charge = 0; int creditLimit = 0; int totalCharge = 0; int accBalance = 500; int accNumber = 12345;

        System.out.println("Enter your account number: ");
        accNumber = input.nextInt();
        if(accNumber==12345) {
            while (counter <= 5) {
                System.out.println("Enter charge on itemOne: ");
                charge = input.nextInt();
                totalCharge = totalCharge + charge;




            }
        }


    }


}
