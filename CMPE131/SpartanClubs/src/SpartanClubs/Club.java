package SpartanClubs;

public class Club {
	private String clubName;
	private String clubDesc;
	private ArrayList<Member> members;
	private ArrayList<Officer> Officers;
	private ArrayList<Application> apps;
	
	public Club()
	{
		//used when searching and desired club is not found
		this.clubName = "The club you are looking for is not found. Please try again.";
	}
	
	public Club(String clubName, String clubDesc)
	{
		this.clubName = clubName;
		this.clubDesc = clubDesc;
	}
	
	private createRoster()
	
	public String getClubName()
	{
		return clubName;
	}
	
	public String getClubDesc()
	{
		return clubDesc;
	}
	
	public ArrayList<Member> getMembers(ArrayList<Students> allStudents)
	{
		return members;
	}
	
	public ArrayList<Officer> getOfficers()
	{
		return officers;
	}
	
	public ArrayList<Application> getApps()
	{
		return apps;
	}
}
