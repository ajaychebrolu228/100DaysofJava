import java.util.Scanner;
public class BinarytoDecimal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		int binary_num = sc.nextInt();
		int decimal = 0, pow = 1;
		while(binary_num>0){
			int digit = binary_num%10;
			decimal += digit * pow;
			pow *= 2;
			binary_num /= 10;
		}
		System.out.println(decimal);
	}
}
