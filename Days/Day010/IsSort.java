import java.util.Scanner;
public class IsSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the Array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < a.length-1; i++) {
            if(!(a[i] <= a[i+1])) {
                System.out.println("Array is not Sorted.");
                return;
            }
        }
        System.out.println("Array is Sorted.");
    }
}
