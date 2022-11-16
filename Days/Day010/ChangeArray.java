public class ChangeArray {
    static void change(int a[]) {
        for(int i = 0; i < a.length; i++) {
            a[i] = 5;
        }
    }
    public static void main(String[] args) {
        int a [] = {1,5,3,3,22};
        change(a);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
