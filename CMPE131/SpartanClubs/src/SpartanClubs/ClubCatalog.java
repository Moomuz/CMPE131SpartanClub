package SpartanClubs;

public class ClubCatalog {
	private ArrayList<Club> clubs;
	
	public ClubCatalog()
	{
		
	}
	
	public Club search(String inquiry)
	{
		for(Club club: clubs)
		{
			if(club.getClubName().contains(inquiry))
			{
				return club;
			}
		}
		return new Club(); 
	}
	

}
