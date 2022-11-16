import java.util.Scanner;

import java.util.Scanner;
public class OccurenceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the Array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int count = 0;
        int n = sc.nextInt();
        for(int i = 0; i < a.length; i++) {
            if(a[i] == n) count++;
        }
        System.out.println(n + " occured " + count + " times.");
    }
}
