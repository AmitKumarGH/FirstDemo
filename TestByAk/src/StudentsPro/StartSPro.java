package StudentsPro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartSPro {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to students Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 to ADD students");
			System.out.println("PRESS 2 to Delete students");
			System.out.println("PRESS 3 to Display students");
			System.out.println("PRESS 4 to update students");
			System.out.println("PRESS 5 to exit students");
			int c= Integer.parseInt(br.readLine());
			if(c==1) {
				System.out.println("Enter user name : ");
				String name = br.readLine();
				System.out.println("Enter user phone : ");
				String phone = br.readLine();
				System.out.println("Enter user City : ");
				String city = br.readLine();
				Student st = new Student(name, phone, city);
				if(c==1) {
					System.out.println("Student is added successfully....");
				}else {
					System.out.println("something went wrong try again....");
				}
				System.out.println(st);
		
	}else if(c==2) {
			System.out.println("Enter student id to delete : ");
			int userId=Integer.parseInt(br.readLine());
			
			if(c==2) {
				System.out.println(userId+"Deleted....");
			}else {
				System.out.println("Somthing went wrong");
			}
		}else if(c==3) {
			System.out.println("showAllstudent()");

		}else if(c==4) {
			//update student 
			//Ask for student id u want to update
			System.out.println("Enter student id");
			//check if entered id is there in data base
			//if yes ask for other details to be updated like name.
			//updates 
			int id = Integer.parseInt(br.readLine());
			if(id==22) {
				System.out.println("Yes id is there..");
				Student st = new Student(id, null, null, null);
				System.out.println("Enter Student name to update..");
				st.setStudentname(br.readLine());
				System.out.println("Enter Student phonenumber to update..");
				st.setStudentphone(br.readLine());
				System.out.println("Enter Student city to update..");
				st.setStudentcity(br.readLine());
				
				if(id==22) {
					System.out.println("Student update Successfully");
				}else {
					System.out.println("something went worng");
				}
			}else if(c==5) {
				
			break;
		}else {
		}
	}
	System.out.println("Thanku for using my application");
}
}
	}

