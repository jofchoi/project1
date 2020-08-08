package hiding;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	String Info;

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String pstudentName) {
		this.studentName = pstudentName;
	}
	public void showInfo() {
		System.out.println(studentName + studentID);
	}
}
