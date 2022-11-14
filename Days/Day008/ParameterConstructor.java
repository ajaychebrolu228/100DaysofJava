import java.util.Scanner;
public class ParameterConstructor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		MyClass t = new MyClass(n);
		System.out.println("You have entered " + t.x);
		
	}
}

class MyClass{
	int x;
	MyClass(int i) {
		this.x = i;
	}
}
