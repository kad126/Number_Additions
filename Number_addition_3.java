//This is a program that asks the user for a number n and gives them the possibility to choose
//between computing the sum and computing the product of 1…n.
	
import java.util.Scanner;

public class Number_addition_3 {
	
	public static void main(String args []) {
		
		Scanner data = new Scanner (System.in);
		int total = 0;
		int number = 0;
		String reply = "l";
		boolean exit = false;
		
		System.out.println("Please input positive integer");
		number = data.nextInt();
		
		while (!exit) {
			if (number_checker(number) == true) {
				System.out.println("Would you like the sum or the product?");
				data = new Scanner(System.in);
				reply = data.nextLine();
			
				switch (reply.toLowerCase()) {
					case "sum":
						exit = true;
						total = add(number);
						System.out.println("The total is "+ total);
						break;
					case "product":
						exit = true;
						total = product(number);
						System.out.println("The product is "+ total);
						break;
					default:
						System.out.println("Sorry, please try again.");
						break;	
				}
			}
		}
	}
		
	
	public static boolean number_checker(int number) {
			if (number > 0) 
				return true;
			else
				return false;
			}
	
	public static int add(int number) {
	int total = 0;
	for(int i=1; i<=number; i++) {
		total = total + i;
	} 
	return total;
}
	public static int product(int number) {
		int total = 1;
		for(int i=1; i<=number; i++) {
			total = total * i;
		} 
		return total;
	}
	}
