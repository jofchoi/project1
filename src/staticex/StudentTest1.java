package staticex;

import constructor.Student1;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("������")
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.getstudentName);
		
		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
