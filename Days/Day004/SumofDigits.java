import java.util.Scanner;
public class SumofDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int sum = 0;
        int n = sc.nextInt();
        while(n > 0) {
            int i = n % 10;
            n /= 10;
            sum += i;
        }
        System.out.println("Sum of Digits = "+sum);
    }
}
