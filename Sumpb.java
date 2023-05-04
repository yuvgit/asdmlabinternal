package dac23;
import java.util.Scanner;
public class Sumpb {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = s.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;

		while (number != 0) 
		{
			int digit = number % 10;
			if (digit % 2 == 0) 
			{
				evenSum += digit;
			} else
			{
				oddSum += digit;
			}
			number /= 10;
		}
		System.out.println("Sum of even digits: " + evenSum);
		System.out.println("Sum of odd digits: " + oddSum);
	}
}


