package week03;

import java.util.Scanner;

public class DebugWeek3_3 {

	public static void main(String args[]) {
		int item;
		String output;
		final int LOW = 111;
		final int HIGH = 999;
		final int CUTOFF = 500;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter item number");
		item = input.nextInt();
		if (item > HIGH || item < LOW) {
			output = "Item is Invalid";	
			System.out.println(output);
		} else {
			if (item < CUTOFF){
				output = "Valid - in Automotive Department";
				System.out.println(output);
			} else {
				output = "Valid - Item in Housewares Department";
				System.out.println(output);
			}
		}
		input.close();
	}	
	
}
