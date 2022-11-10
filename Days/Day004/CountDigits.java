import java.util.Scanner;
public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int count = 0;
        int n = sc.nextInt();
        while(n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("Digits count = "+count);
    }
}
