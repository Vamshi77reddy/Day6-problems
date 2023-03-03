package day6Problems;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n, a=0,b=1,c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		System.out.println("Fibonacci Series:");
		for(int i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+"");
		}
		}
		

}
