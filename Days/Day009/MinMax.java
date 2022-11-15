import java.util.Scanner;
public class MinMax {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int sample[] = new int[n];
		for(int i = 0;  i < n; i++){
			System.out.print("Enter sample"+"["+i+"] : ");
			sample[i] = sc.nextInt();
		}
		int min, max;
		min = max = sample[0];
		for(int i = 0; i < n; i++) {
			if(sample[i] < min) min = sample[i];
			if(sample[i] > max) max = sample[i];
		}
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
	}
}
