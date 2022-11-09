public class UnaryOperator {
    public static void main(String args[]) {
        int p = 4;
        int q = 4;
        System.out.println(p++); //4
        System.out.println(p); //5
        System.out.println(++q); //5
        System.out.println(q); //5
        
        int x = p++;
        int y = ++q;
        System.out.println(x); //5
        System.out.println(y); //6
    }
}
