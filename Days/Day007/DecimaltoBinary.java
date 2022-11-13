import java.util.Scanner;
public class DecimaltoBinary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal number: ");
		int Decimal = sc.nextInt();
		int Binary = 0,pow = 1;
		while(Decimal>0) {
			int rem = Decimal%2;
			Binary += rem*pow;
			pow *= 10;
			Decimal /= 2;
		}
		System.out.println(Binary);
	}
}
