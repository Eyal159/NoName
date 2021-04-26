import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		College ort_singa=new College("ort singalovski");
		int user_input;
		boolean flag=false;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("1.create a new Department ");
			System.out.println("2.add a new lecturer ");
			System.out.println("3.add a new student ");
			System.out.println("4.show all college departments ");
			System.out.println("5.show all student in a specific deparmtent ");			
			System.out.println("6.show department name with most students and students count ");
			System.out.println("7.to exit");
			System.out.println("\nenter you choise !");
			user_input=scan.nextInt();
			
			switch (user_input) {
				case 1:
					System.out.println("enter department name ! ");
					ort_singa.createNewDepartment(scan.next());
					break;
				case 2:
					System.out.println("enter teacher name,hour salary and department name ! ");
					ort_singa.createNewLecturer(scan.next(), scan.nextInt(), scan.next());
					break;
				case 3:
					System.out.println("enter student name,id and department name !");
					ort_singa.createNewStudent(scan.next(), scan.nextInt(), scan.next());
					break;
				case 4:
					ort_singa.displayCollege(ort_singa);
					break;
				case 5:
					System.out.println("enter department name !");
					ort_singa.displaySpecificDepartment(scan.next());
					break;
				case 6:
					ort_singa.showBiggestDepartment(ort_singa);
				case 7:
					flag=true;
					break;
			}			
			if (flag) {
				System.out.println("bye !");
				break;		
			}					
		}
	}

}
