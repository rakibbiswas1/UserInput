package wow;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int count = a;
		while (count > 0) {
			System.out.println(count);
			count--;
		}
	}
}