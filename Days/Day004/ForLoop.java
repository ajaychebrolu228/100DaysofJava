// This program print sum of all natural numbers upto given input
import java.util.Scanner;
public class ForLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int i,sum = 0;
        for(i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of "+n+" Natural numbers is :"+sum);
    }
}
