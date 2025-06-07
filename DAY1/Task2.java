package basicprogram;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter your pin number:");
		int pin=ref.nextInt();
		if(pin == 1234) {
		System.out.println("Enter the amount:");
        int amount=ref.nextInt();
                if(amount <=4000) {
                	System.out.println("withdrawn successfully");
                }
                else {
                	System.out.println("Insufficient amount");
                }
         }
		else {
			System.out.println("Invalid pin number");
			
			
		}
        
	}

}
