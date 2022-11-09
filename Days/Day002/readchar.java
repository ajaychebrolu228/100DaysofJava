import java.util.Scanner;
public class readchar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char c = sc.next().charAt(0);
		System.out.println(c);
	}
}
