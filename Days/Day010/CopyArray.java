import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2 [] = Arrays.copyOf (arr1, arr1.length);
        int arr3 [] = Arrays.copyOfRange(arr1, 1, arr1.length-1);
        System.out.print("Arr 1 : ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Arr 2 : ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.print("Arr3 : ");
        for(int i = 0; i < arr3.length; i ++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
