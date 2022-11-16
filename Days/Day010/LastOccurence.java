import java.util.Scanner;

import java.util.Scanner;
public class LastOccurence {
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
        int last = -1;
        int n = sc.nextInt();
        for(int i = 0; i < a.length; i++) {
            if(a[i] == n) {
                last = i;
            }
        }
        if (last!=-1) System.out.println(last + " Last occurence index of " + n);
        else System.out.println("Element is not found in Array.");
    }
}
