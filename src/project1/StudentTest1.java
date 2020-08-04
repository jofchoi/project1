package project1;

public class StudentTest1 {

	public static void main(String[] args) {
Student student1 = new Student();
student1.studentName = "안연수";
Student student2 = new Student();
student2.studentName = "박소연";
Student student3 = new Student();
student3.studentName = "최종문";
System.out.println(student2.studentName);
System.out.println(student1.getStudentName());
System.out.println(student3.getStudentName());
	}

}
