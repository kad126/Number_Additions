//When you input an integer, only multiples of three or five are considered in the sum of of 1 to n.
sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
import java.util.Scanner;

public class Number_Addition_2 {
	public static void main(String args []) {
		Scanner input = new Scanner (System.in);
		int result = 0; //the final result
		int number; //the number they provide

		System.out.println("Please input positive integer ");
		number = input.nextInt();
		
		if (number_checker(number) == true) {
			result = calculator(number);
			System.out.println(result);
		} else {
		System.out.println("Sorry, the number selected is not valid.");
	}
}
	public static boolean number_checker(int number) {
		if (number>0)
			return true;
		else 
			return false;
	}
	
	public static int calculator(int number) {
		int storage = 0; //Store the result
		int counter = 1; //Counter
		
		while (counter <= number) {
		
			//If counter is a multiple of 3 or 5!!!
			if (counter % 3 == 0 || counter % 5 == 0) {
				storage = storage + counter;
			}
			counter ++;
		}
		return storage;
	}
}
