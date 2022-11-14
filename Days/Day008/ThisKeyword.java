import java.util.Scanner;
public class ThisKeyword {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Data n = new Data("Ajay",999999999);
		n.display();
	}
}

class Data {
	String name;
	long phonenumber;
	Data(String name, long phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;
	}
	void display(){
		System.out.println(this.name + " phone number is " + this.phonenumber);
	}
}
