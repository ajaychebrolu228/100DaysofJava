import java.util.Scanner;
public class Sum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int sample[] = new int[n];
		for(int i = 0;  i < n; i++){
			System.out.print("Enter sample"+"["+i+"] : ");
			sample[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += sample[i];
		}
		System.out.println("Sum is : " + sum);
	}
}
