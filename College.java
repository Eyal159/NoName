import java.util.ArrayList;

public class College {
	private String college_name;
	private ArrayList<Lecturer> allDepartmentsLecturers ;
	private ArrayList<Student> allDepartmentsStudents ;
	private ArrayList<Department> allDepartments;
	
	public College(String name) {
		this.college_name=name;
		allDepartmentsLecturers=new ArrayList<Lecturer>();
		allDepartmentsStudents=new ArrayList<Student>();
		allDepartments=new ArrayList<Department>();
	}
	
	public void createNewLecturer(String name,int salary,String department_name){
		Lecturer tempLecturer=new Lecturer(name, salary);	
		addLecturerToCollege(tempLecturer, department_name);
	}
	public void createNewDepartment(String name) {
		Department tempDepartment=new Department(name);
		allDepartments.add(tempDepartment);
	}
	
	public void createNewStudent(String name,int id,String department_name) {
		Student tempStudent=new Student(name, id);
		addStudentToCollege(tempStudent, department_name);
	}
	
	public void showBiggestDepartment(College college) {
		Department tempDep=mostStudentsInDepartment(college);
		tempDep.showBiggestDepartmnetStats(tempDep);
	}
	
	public void displaySpecificDepartment(String name) {
		boolean result=false;
		int index=-1;
		Department tempDep=new Department(name);
		result=allDepartments.contains(tempDep);
		if (result) 
			index=allDepartments.indexOf(tempDep);
		if (index!=-1)
			allDepartments.get(index).displayDepartment();			
		}
	
	
	public void addLecturerToCollege(Lecturer lecturer,String department_name) {
		Department tempDep=new Department(department_name);
		int result=allDepartments.indexOf(tempDep);	
		if (result!=-1) {
			allDepartments.get(result).addLecturerToDepartment(lecturer);
			allDepartmentsLecturers.add(lecturer);
		}
		else
			System.out.println("sorry..cant add a lecturer to a non-existing department ! ");
	}
		
	public void addStudentToCollege(Student student,String department_name) {
		Department tempDep=new Department(department_name);
		int result=allDepartments.indexOf(tempDep);
		System.out.println(result);
		if (result!=-1) {
			allDepartments.get(result).addStudentToDepartment(student);
			allDepartmentsStudents.add(student);
		}
		else
			System.out.println("sorry..cant add a student to a non-existing department ! ");
	}
	
	public void displayCollege(College college) {
		for(int i=0;i<allDepartments.size();i++)
			allDepartments.get(i).displayDepartment();
	}
	
	public Department mostStudentsInDepartment(College college) {
		int biggestDepartmentIndex=-1,max=0,result;
		
		for (int i=0;i<allDepartments.size();i++) {
			result=allDepartments.get(i).studentCountInDepartment();
			if (max<result) {
				max=result;
				biggestDepartmentIndex=i;
			}				
		}
		return allDepartments.get(biggestDepartmentIndex);		
	}
}
