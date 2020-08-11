package staticex;

public class StudentTest4 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("Lee");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.getStudentName() + "," + studentLee.studentID);

		Student2 studentSon = new Student2();
		studentSon.setStudentName("Son");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.getStudentName() + "," + studentSon.studentID);
	}
}
