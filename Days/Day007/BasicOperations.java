import java.util.Scanner;
public class BasicOperations {
	public static void main(String args[]) {
		Operations aj = new Operations();
		aj.set();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		if(choice == 1) {
			aj.add();
		}
		else if (choice == 2) {
			aj.subtract();
		}
		else {
			System.out.println("Kindly enter valid input");
		}
	}
}

class Operations {
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	void set() {
		System.out.print("Enter num1: ");
		a = sc.nextInt();
		System.out.print("Enter num2: ");
		b = sc.nextInt();
	}
	void print() {
		System.out.print("num1 is : "+a);
		System.out.print("num2 is : " +b);
	}
	void add() {
		System.out.println(a+b);
	}
	void subtract() {
		System.out.println(a-b);
	}
}
