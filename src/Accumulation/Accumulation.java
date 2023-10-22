package Accumulation;

import java.util.Scanner;

public class Accumulation 
{
	public static void main(String[] args) 
	{
		int num, sum = 0, count = 0;
		double average;
		Scanner scan = new Scanner(System.in);
		System.out.println("Pleas enter a value, negative value to exit: ");
		num = scan.nextInt();
		while (num >= 0)
		{
			System.out.println("The number is " + num);
			count++;
			sum = sum + num;
			System.out.println("Number of entered numbers: " + count);
			System.out.println("Pleas enter a value, negative value to exit: ");
			num = scan.nextInt();
		}
		average = (double)sum/count;
		System.out.println("You entered " + count + " positive numbers.");
		System.out.println("Sum: " + sum);
		System.out.println("Average is " + average);
		System.out.println("Outside of loop.");
		
	}
}
