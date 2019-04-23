package SpartanClubs;

import java.util.ArrayList;

public class Student {
	private String name;
	private int year;
	private int idNumber;
	private String email;
	private String password;
	private String bioDesc;
	private ArrayList<String> memberships;
	private ArrayList<String> leaderships;
	
	public Student(String name, int year, int IdNumber, String email, String password, String bioDesc)
	{
		this.name = name;
		this.year = year;
		this.email = email;
		this.bioDesc = bioDesc;
		this.memberships = new ArrayList<String>();
		this.leaderships = new ArrayList<String>();
	}
	
	public Student() //used when login fails
	{
		System.out.println("Login failed. Please try again.");
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getIdNumber()
	{
		return this.idNumber;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public String getBioDesc()
	{
		return this.bioDesc;
	}
	
	public void addMembership(String clubName)
	{
		this.memberships.add(clubName);
	}
	
	public void addLeadership(String clubName)
	{
		this.leaderships.add(clubName);
	}
}
