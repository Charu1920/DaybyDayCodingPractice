package src;

import java.util.Scanner;

public class ProductOfTwoNumber {
	public static int CalculateOfProduct(int a, int b) {
		return a* b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Product of Two Number :" + (CalculateOfProduct(a, b)));

	}

}
