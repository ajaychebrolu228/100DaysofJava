public class StudentDetails {
	public static void main(String args[]) {
		Student aj = new Student();
		System.out.println(aj.name);
		System.out.println(aj.branch);
		System.out.println(aj.section);
	}
}
class Student{
	String name = "Ajay";
	String branch = "CSE";
	String section = "2D"; 
}
