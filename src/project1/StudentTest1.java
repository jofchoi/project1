package project1;

public class StudentTest1 {

	public static void main(String[] args) {
Student student1 = new Student();
student1.studentName = "�ȿ���";
Student student2 = new Student();
student2.studentName = "�ڼҿ�";
Student student3 = new Student();
student3.studentName = "������";
System.out.println(student2.studentName);
System.out.println(student1.getStudentName());
System.out.println(student3.getStudentName());
	}

}
