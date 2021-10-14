package sessiontask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S19_StudentDetailsRegEx {
	public static void main(String[] args) {
		 Student students[] = new Student[5];
		 Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i<5) { 
			System.out.println();
			System.out.println("----------"+"Student Details : "+(i+1)+"-----------");
			System.out.print("Enter Student's Id:");
			int studentId = sc.nextInt();
			sc.nextLine();
			while(!((studentId)>=0)) {
				System.out.println("Invalid Id!");
				System.out.print("Enter Student's Id:");
				studentId = sc.nextInt();
			}

			System.out.print("Enter Student's Name:");
			String studentName = sc.nextLine();
			while(studentName =="") {
				System.out.println("Invalid Name! Try Again!");
				System.out.print("Enter Student's Name! :  ");
				studentName = sc.nextLine();
				
			}

			System.out.print("Enter Student's Email :");
			String emailId = sc.nextLine();
			while(!emailId.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
				System.out.println("Invalid Password! Try again!");
				System.out.print("Enter Student's Email :");
				emailId = sc.nextLine();
			}

			System.out.print("Enter Student's Mobile:");
			String mobile = sc.nextLine();
			while(!mobile.matches("[7-9][0-9]{9}")) {
				System.out.println("Invalid Mobile Number!");
				System.out.print("Enter Student's Mobile:");
				mobile = sc.nextLine();
			}
			
			students[i] = new Student(studentId,studentName,emailId,mobile);
			i++;
		}
		for(int j=0;j<students.length;j++){
			System.out.println();
			System.out.println("----------"+"Student Details : "+(j+1)+"-----------");
			System.out.println("Student ID : "+students[j].getStudentId());
			System.out.println("Student Name : "+students[j].getStudentName());
			System.out.println("Student Email : "+students[j].getEmailId());
			System.out.println("Student Mobile : "+students[j].getMobile());
		
		}
		
	}
}
