//Print a given a name of function.
package src;

import java.util.Scanner;

public class function {
	
	public static void printByName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		printByName("This is the you given your name as of print using function : " +  name);
		

	}

}
