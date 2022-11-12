import java.util.Scanner;
public class Pattern2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < 2*n ; i++)
		{
			int k = i > n ? 2 * n - i : i ;
			int space = n - k;
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int l = 0; l < k; l++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
