package day6Problems;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :: ");

		int number = scanner.nextInt();
		System.out.println("Given number before reverse is = "+ number);

		int rem;
		int rev=0;
		while (number !=0)
		{
			rem = number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("After the reverse the number is ::" + rev);
	}
}
