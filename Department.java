import java.util.ArrayList;

public class Department {
	
	private String department_name;
	private ArrayList<Lecturer> DepartmentLecturers ;
	private ArrayList<Student> DepartmentStudents ;
	
	
	public Department(String name) {
		this.department_name=name;
		DepartmentLecturers=new ArrayList<Lecturer>();
		DepartmentStudents=new ArrayList<Student>();
	}
	
	public String getDepartmentName() {
		return department_name;
	}
	
	public void addLecturerToDepartment(Lecturer lecture) {
		boolean result=this.DepartmentLecturers.contains(lecture);
		if (result)
			System.out.println("Sorry..Lecturer is allready added to the list ! ");
		else
			DepartmentLecturers.add(lecture);					
	}
	
	
	public void addStudentToDepartment(Student student) {
		boolean result=this.DepartmentStudents.contains(student);
		if (result)
			System.out.println("Sorry..Student is allready added to the list ! ");
		else
			DepartmentStudents.add(student);
	}
	
	public void displayDepartment() {
		System.out.println("\ndepartment name - "+ getDepartmentName());
		for(int i=0;i<DepartmentLecturers.size();i++)
			DepartmentLecturers.get(i).toString();
		System.out.println("\n");
		for(int f=0;f<DepartmentStudents.size();f++)
			DepartmentStudents.get(f).toString();
	}
	
	public void showBiggestDepartmnetStats(Department dep) {
		System.out.println("Departmnet name - "+department_name+"students count - "+DepartmentStudents.size());
	}
	
	public int studentCountInDepartment(){
		return DepartmentStudents.size();
	}
	
}
