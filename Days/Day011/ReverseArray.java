import java.util.Scanner;;

public class ReverseArray {
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
            System.out.print(a[i]);
        }
        System.out.println();
        int start = 0, end = n-1;
        int temp;
        while(start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array : ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

    }
}
