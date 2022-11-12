import java.util.Scanner;
public class Pattern1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < 2*n ; i++)
		{
			int j = i > n ? 2 * n - i : i ;
			for (int k = 0; k < j; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
