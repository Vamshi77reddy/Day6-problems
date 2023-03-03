package day6Problems;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int num,sum=0,i=1;
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number ::");
			 num=sc.nextInt();
		while(i<=num/2) {
		
			if(num%i==0) {
				sum=sum+i;}
			i++;
		}
		if(sum==num) {
		
			System.out.println("Given number is perfect");
		}
		else
		{
			System.out.println("Given number is not perfect");
		}
		}
}
