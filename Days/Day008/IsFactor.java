import java.util.Scanner;
public class IsFactor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number(Factor): ");
		int a = sc.nextInt();
		System.out.print("Enter the number: ");
		int b = sc.nextInt();
		Factor obj = new Factor();
		if(obj.isFactor(a, b)) System.out.println(a + " is a facor of " + b);
	}
}

class Factor {
	boolean isFactor(int a, int b) {
		if( (b % a) == 0) return true;
		else return false;
	}
}
