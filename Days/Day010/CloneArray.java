public class CloneArray {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2 [] = arr1.clone();
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
