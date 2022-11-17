import java.util.Scanner;
import java.util.Arrays;

public class KthSmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Elements : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        System.out.print("Original Array : ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int b[] = Arrays.copyOf(a, n);
        Arrays.sort(b);
        System.out.print("Enter the k th term:");
        int k = sc.nextInt();
        System.out.println(k + " th Smallest Element: " + b[k-1]);
        System.out.println(k + " th Largest Element: " + b[n-k]);

    }
}
