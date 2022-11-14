import java.util.Scanner;
public class ConstructorDemo {
	public static void main(String args[]) {
		MyClass t = new MyClass();
		System.out.println(t.x);
	}
}

class MyClass {
	int x;
	MyClass () {
		x = 25;
	}
}
