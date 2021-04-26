
public class Student {

	private String student_name;
	private int student_id;
	
	public Student(String name,int id) {
		this.student_name=name;
		this.student_id=id;
	}
	
	
	public String getStudentName() {
		return student_name;
	}
	
	public int getStudentID() {
		return student_id;
	}
	
	@Override
	public String toString() {
		return"student name - "+student_name+" |  student id - "+student_id;
	}
	
	
}
