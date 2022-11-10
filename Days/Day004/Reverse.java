import java.util.Scanner;
public class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverse = 0, temp = num, remainder;
        while(temp > 0) {
            remainder = temp % 10;
            reverse = (reverse * 10 ) + remainder;
            temp /= 10;
        }
        System.out.println("Reverse of "+ num +" is " + reverse);
    }
}
