package src;

import java.util.Scanner;

public class SumOfTwoNumber {
	public static int CalculateSum(int a, int b) {
		int Sum = a + b;
		return Sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FirstNumber : ");
		int a = sc.nextInt();
		System.out.println("Enter the SecondNumber : ");
		int b = sc.nextInt();
		int Sum = CalculateSum(a, b);
		System.out.println("Sum of the two Number : " + Sum);
		System.out.println("Sum of the two Number Using Functions");

	}

}
