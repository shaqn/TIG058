package club;

import java.util.ArrayList;
import java.util.Collections;
import tig058.handin01.registry.ClubRegistry;
import tig058.handin01.member.Member;
import tig058.handin01.member.MemberAlphaComparator;
import tig058.handin01.member.MemberAlphaFirstnameComparator;
import tig058.handin01.log.Logger;
import java.io.Console;

/**
* A class which contains methods for the club menu
* 
*/


public class ClubHelper {

    private ClubRegistry cr;
    private Member mem;
/**
* A method which formats the print
*/
    public String formaterat(Member m){ 		
    	return String.format("ID: %-10d Name: %-25s Age: %-10d Team: %-10s Parents: %s %-15s", m.getId(), m.getName(), m.getAgeThisYear(), m.getTeam(), m.getParents(), m.isParent());
    }

    public String formaterar(Member m){
    	return String.format("ID: %-10d Name: %-25s Age: %-10d Team: %-10s", m.getId(), m.getName(), m.getAgeThisYear(), m.getTeam());
    }

/**
* A classmethod which calls the ClubRegistry 
*
*/
    public ClubHelper() {					
		Logger.debug("Init system");
		cr = ClubRegistry.getInstance();
    }
/**
* A method which asks the user to input an answer, 
* in this case a choice of menu 
*/
    public String askUser(String s) {
		Console console = System.console();
		String input = console.readLine(s);
		return input;
    }

 /**
* A two methods which are made for input 
* --members : returns a list of all members
* --teams   : returns a list of all teams
*/
      public void printMembersAll() {  	 // --members (If --members is inprinted by  the caller: All the members will be listed )
		Logger.debugM();
		ArrayList<Member> members = 
			cr.getMembers();

		System.out.println("All Members:");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}
    }

    public void printTeamsAll() {  	 // --teams (If --teams is inprinted by  the caller: All the teams will be listed )
		Logger.debugM();
		ArrayList<String> teams = 
			cr.getTeams();

		System.out.println("All Teams: \n");
		for (String m: teams) {
		    System.out.println(m);
		}
    }

/**
* A method that lists the members in alphabetic order of first name
* returns a list of all members in order of first name
*/
     public void printMembersAlphaFirstName() {  		//Menualt. 1
		Logger.debugM();
		ArrayList<Member> members = 
			cr.getMembers();
		Collections.sort(members, new MemberAlphaFirstnameComparator());

		System.out.println("Members:");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}
    } 
/**
* A method that lists the members in alphabetical order of surname
* returns a formated list of all members in order of last name
*/
    public void printMembersAlpha() {     		   //Menualt. 2
		Logger.debugM();
		ArrayList<Member> members = 
		    cr.getMembers();
		Collections.sort(members, new MemberAlphaComparator());

		System.out.println("Members:");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}
    }
/**
* A method that lists the members in order of ID
* returns a formated list of all members in order of ID number
*/
    public void printID() {						//Menualt. 3 
		Logger.debugM();
		ArrayList<Member> members = 
		    cr.getMembers();
		System.out.println("Members:");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}
    }
 
/**
* A method that lists members in order of team
* returns a list of all members in order of teams
* Here a "MemberTeamComparator" has been created
*/
    public void printTeams() {						//Menualt. 4 
		Logger.debugM();
		ArrayList<Member> members = 
			cr.getMembers();
		Collections.sort(members, new MemberTeamComparator());
		System.out.print("All members sorted by Teams: \n" );
		for (Member m: members) {
		    System.out.println(formaterar(m) + " ");
		}
    }
/**
* A method that lists the members in a specific team
* returns a formated list of all members depending on the team inserted by the user
*/
    public void printTeamMembers() {			//Menualt. 5 
		Logger.debugM();
		String team = askUser("What team do you want to list? ");
		ArrayList<Member> members = 
			cr.getTeamMembers(team);
		
		System.out.println("Members in " + team + ":");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}

	}
/**
* A method that lists parents in order of the team ordered by the caller
* returns a formated list of all members parents depending on the team inserted by the user
*/
	    public void printParents() {			//Menualt. 6 
		Logger.debugM();
		String team = askUser("Which teams' parents do you want to list? ");
		ArrayList<Member> members = 
			cr.getTeamMembers(team);

		for (Member m: members){      //Går igenom alla members ut members arrayen
			if(m.isParent()){     //betyder automatiskt:  om detta är sant ...
				System.out.println(formaterat(m));
			} 
		}
    }

/**
* A method that lists e-mails in order by a member ordered by the caller
* returns a list of e-mail(s) depending on the ID inserted by the user
* if the member isn't an adult (18Y/O) the e-mail of the members parents will be listed
*/
	 public void emailMember() {						//Menualt. 7 
		String id = askUser("What's your ID?: \n");
		int idint = Integer.parseInt(id);

		Member m = cr.getMember(idint);
		
		if (m==null) { 
			return ; 
		}
		
		emailMember(m);
   	} 
/**
* @param m The member for which you want to print the email
*/
    public void emailMember(Member m) {
		Logger.debugM();
		

		ArrayList<Member> parents = 
					cr.getAdults(m);  //Finds and returns the adults of a given member. if the member is an adult null is returned

		System.out.print("Email to " + m.getName());
		if (parents==null || parents.size()==0) { 
		    System.out.println(" <" + m.getEmail() + ">"); 
		} 
		else {
		    System.out.println(" via parents:");
		    for (Member p: parents) {
				System.out.println(" * " + p.getName() + "<" + p.getEmail() + ">");
	   		}
		}
    }


}