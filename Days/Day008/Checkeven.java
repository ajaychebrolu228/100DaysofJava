import java.util.Scanner;
public class Checkeven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		check c = new check();
		if(c.iseven(num)){
			System.out.println(num+" is even");
		}
	}
}

class check {
	boolean iseven(int n) { 
		if(n % 2 == 0) {
			return true;
		}
		return false;
	}
}
