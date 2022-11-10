import java.util.Scanner;
public class SumSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++){
            if(i % 2 == 0){
                result -= i;
            }
            else {
                result += i;
            }
        }
        System.out.println("Result is " + result);
    }
}
