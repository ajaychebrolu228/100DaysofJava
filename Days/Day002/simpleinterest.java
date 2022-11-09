import java.util.Scanner;
public class simpleinterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount: ");
		float p = sc.nextFloat();
		System.out.print("Enter the Interest: ");
		float r = sc.nextFloat();
		System.out.print("Enter the Time: ");
		float t = sc.nextFloat();
		float si = (p*t*r)/100;
		System.out.println("Simple Interest is "+si);
	}
}
