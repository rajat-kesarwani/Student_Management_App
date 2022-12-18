import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;


public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Student Management App1");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Exit");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//add
				System.out.println("Enter user name :");
				String name = br.readLine();
				
				System.out.println("Enter user phone :");
				String phone = br.readLine();
				
				System.out.println("Enter user city :");
				String city = br.readLine();
				
				// create student object to store student
				Student st = new Student(name, phone, city);
				
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student is Added Successfully ");
				}
				else
				{
					System.out.println("Something went wrong try again....");
				}
				
				System.out.println(st);
			}
			else if(c ==2) {
				//delete
				
				System.out.println("Enter student id to delete: ");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deletStudent(userId);
				if(f)
				{
					System.out.println("Deleted......");
				}
				else
				{
					System.out.println("Something went wrong ......");
				}
				
				
			}
			else if(c == 3)
			{
				//diplay
				StudentDao.showAllStudent();
			}
			else if(c == 4) {
				//exit
				break;
			}
			else
			{
				
			}
		}
		System.out.println("ThankYou for using my Application");
		System.out.println("See you soon.....1");


	}

}
