import java.util.Scanner;
public class sum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second number: ");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Sum of " + a +" and " + b + " is " + c);
	}
}
