package wow;
import java.util.Scanner;
public class forloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		for (int count=a; count>0; count--) {
		System.out.println(count);
		}
	}
}
