//When you input an integer, n, the programs calculates and prints the sum of 1 to n.

import java.util.Scanner;

public class Number_Addition {
	public static void main(String args []) {
		Scanner digits = new Scanner (System.in);

		
		System.out.println("Please input positive integer ");
		Integer number = digits.nextInt();
	if (number_checker(number) == true) {
		Integer answer = (number*(number+1))/2;
		System.out.println(answer);
	} else {
		System.out.println("Sorry, the number selected is not valid.");
	}
}
	public static boolean number_checker(Integer number) {
		if (number>=0)
			return true;
		else 
			return false;
	}
}
