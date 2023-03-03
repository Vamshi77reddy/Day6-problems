 package day6Problems;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {


		Scanner getUserInput = new Scanner(System.in);

		System.out.print("start");
		byte startClick=getUserInput.nextByte();
		double startTimer=System.currentTimeMillis();	//This shows time in milliseconds

		System.out.println("end");
		byte endClick=getUserInput.nextByte();
		double endTimer=System.currentTimeMillis();

		double timeTaken=(endTimer-startTimer)/1000;

		System.out.println(":  Time take  :: "+timeTaken);



}
	
}
