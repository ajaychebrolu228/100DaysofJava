import java.util.Scanner;
public class Pattern3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= n-i) {
				System.out.print(" ");
				}
				else {
					System.out.print(n-j+1);
				}
			}
			for (int k = 1; k < i; k++) {
					System.out.print(k+1);
			}
			System.out.println();
		}
	}
}
