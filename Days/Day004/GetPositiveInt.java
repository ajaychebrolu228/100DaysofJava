// This program prompt user to enter number until positive Integer
import java.util.Scanner;
public class GetPositiveInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the Positive Number: ");
            n = sc.nextInt();
        }
        while(n<1);
    }
}
