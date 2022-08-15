package wow;
import java.util.Scanner;

public class wowo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        if (a<b){
            System.out.println("if block executed");
        } else if (a>b) {
        	System.out.println("if else block executed");
        }
        else {
            System.out.println("else block executed");
        }
    }
}