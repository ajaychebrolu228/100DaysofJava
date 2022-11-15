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
		System.out.print("Enter the element to Search : ");
		int key = sc.nextInt();
		for(int i = 0; i < n; i++) {
			if(key == sample[i]) { 
				System.out.println(key + " found at index " + i);
				return;
			}
		}
		System.out.println("-1");
	}
}
