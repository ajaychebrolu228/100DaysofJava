import java.util.Scanner;
public class Pattern4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i <= 2*n-1 ; i++) {
			for (int j = 0; j <= 2*n-1; j++) {
				int s = Math.min(Math.min(i,j), Math.min(2*n-i-1,2*n-j-1));
				System.out.print(n-s);
			}
			System.out.println();
		}
	}
}
