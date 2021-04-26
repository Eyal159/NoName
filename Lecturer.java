
public class Lecturer {
	private String teacher_name;
	private int hour_salary;
	
	
	public Lecturer(String name,int salary) {
		this.teacher_name=name;
		this.hour_salary=salary;
	}
	
	public String getTeacherName() {
		return teacher_name;
	}
	
	public int getHourSalary() {
		return hour_salary;
	}
	
	@Override
	public String toString() {
		return "teacher name - "+teacher_name+" |  hour salary - "+hour_salary;
	}
}
