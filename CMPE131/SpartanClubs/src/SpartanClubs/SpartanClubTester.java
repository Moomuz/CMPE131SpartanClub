package SpartanClubs;

import java.util.Scanner;
import java.util.ArrayList;

public class SpartanClubTester {
	private ArrayList<Student> allStudents;
	private ArrayList<Club> allClubs;
	
	public void createStudents()
	{
		//Student ex = new Student(a, 2, );
	}
	
	public void createClubs()
	{
		//add more after Kevin is done
		this.allClubs = new ArrayList<Club>();
		this.allClubs.add(new Club());
		
	}
	
	public Club search(String inquiry)
	{
		for(Club club: allClubs)
		{
			if(club.getClubName().contains(inquiry))
			{
				return club;
			}
		}
		return new Club(); 
	}
	
	public void createNewAccount()
	{
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter full name");
		String name = scan.nextLine();
		System.out.println("Enter year in school");
		int year = scan.nextInt();
		System.out.println("Enter SJSU ID #");
		int idNumber = scan.nextInt();
		System.out.println("Enter email");
		String email = scan.nextLine();
		System.out.println("Enter password");
		String password = scan.nextLine();
		System.out.println("Enter bio description");
		String bioDesc = scan.nextLine();
		Student newStudent = new Student(name, year, idNumber, email, password, bioDesc);
		System.out.println("Enter current club memberships (Enter [1] when done)");
		String membership = "";
		while(!membership.equals("1"))
		{
			membership = scan.nextLine();
			if(!membership.equals("1"))
			{
				newStudent.addMembership(membership);
			}
		}
		System.out.println("Enter current club officer positions (Enter [1] when done)");
		String leadership = "";
		while(!leadership.equals("1"))
		{
			leadership = scan.nextLine();
			if(!membership.equals("1"))
			{
				newStudent.addLeadership(leadership);
			}
		}
		scan.close();
		allStudents.add(newStudent);
	}
	
	public Student login(int userIdNumber, String userPassword)
	{
		for(Student student: allStudents)
		{
			if(student.getIdNumber() == userIdNumber && student.getPassword().equals(userPassword))
			{
				return student;
			}
		}
		return new Student();
	}
	
	public void menu(int select, Student currentStudent)
	{
		if(select == 1) //view profile
		{
			System.out.println("Name: " + currentStudent.getName());
			System.out.println("Schoolyear: " + currentStudent.getYear());
			System.out.println("ID #: " + currentStudent.getIdNumber());
			System.out.println("Email: " + currentStudent.getEmail());
			System.out.println("Bio: " + currentStudent.getBioDesc());
		}
		else //select == 2 == search club
		{
			
		}
	}
	
	public static void main(String[] args)
	{
		SpartanClubTester test = new SpartanClubTester();
		test.createStudents();
		test.createClubs();
		
	    Scanner scan = new Scanner(System.in);  
	    System.out.println("Enter SJSU ID Number or Press [1] to make a new account");
	    int userIdNumber = scan.nextInt();
	    if(userIdNumber == 1)
	    {
	    	test.createNewAccount();
		    System.out.println("Enter SJSU ID Number or Press [1] to make a new account");
		    userIdNumber = scan.nextInt();
	    }
	    System.out.println("Enter Password");
	    String userPassword = scan.nextLine(); 
	    
	    Student currentStudent = test.login(userIdNumber, userPassword);
	    
	    System.out.println("Hello " + currentStudent.getName() + ". What would you like to do?");
	    System.out.println("");
	    System.out.println("[1] View Profile");
	    System.out.println("[2] Search Club");
	    
	    int select = scan.nextInt();
	    test.menu(select, currentStudent);
	    
	    scan.close();
	}
}
