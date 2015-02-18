package club;

import java.util.ArrayList;
import java.util.Collections;
import tig058.handin01.registry.ClubRegistry;
import tig058.handin01.member.Member;
import tig058.handin01.member.MemberAlphaComparator;
import tig058.handin01.member.MemberAlphaFirstnameComparator;
import tig058.handin01.log.Logger;
import java.io.Console;


public class ClubHelper {

    private ClubRegistry cr;
    private Member mem;

    public String formaterat(Member m){
    	return String.format("ID: %-10d Name: %-25s Team: %-10s Parents: %s %-15s", m.getId(), m.getName(), m.getTeam(), m.getParents(), m.isParent());
    }

    public String formaterar(Member m){
    	return String.format("ID: %-10d Name: %-25s Team: %-10s", m.getId(), m.getName(), m.getTeam());
    }


    public ClubHelper() {
		Logger.debug("Init system");
		cr = ClubRegistry.getInstance();
    }

    public String askUser(String s) {
		Console console = System.console();
		String input = console.readLine(s);
		return input;
    }
     public void printMembersAlphaFirstName() {  	 //Menyalt. 1
		Logger.debugM();
		ArrayList<Member> members = 
			cr.getMembers();
		Collections.sort(members, new MemberAlphaFirstnameComparator());

		System.out.println("Members:");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}
    } 

    public void printMembersAlpha() {     		     // Menyalt. 2
		Logger.debugM();
		ArrayList<Member> members = 
		    cr.getMembers();
		Collections.sort(members, new MemberAlphaComparator());

		System.out.println("Members:");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}
    }

    public void printID() {							// Menyalt. 3
		Logger.debugM();
		ArrayList<Member> members = 
		    cr.getMembers();
		System.out.println("Members:");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}
    }
 

    public void printTeams() {						//Menyalt. 4
		Logger.debugM();
		ArrayList<Member> members = 
			cr.getMembers();
		Collections.sort(members, new MemberTeamComparator());
		System.out.print("All members sorted by Teams: \n" );
		for (Member m: members) {
		    System.out.println(formaterar(m) + " ");
		}
    }

    public void printTeamMembers() {				//Menyalt. 5
		Logger.debugM();
		String team = askUser("What team do you want to list? ");
		ArrayList<Member> members = 
			cr.getTeamMembers(team);
		//Collections.sort(members, new MemberAlphaComparator());

		System.out.println("Members in " + team + ":");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}

	}

	    public void printParents() {				//Menyalt. 6
		Logger.debugM();
		String team = askUser("Which teams' parents do you want to list? ");
		//String search = input.trim();
		ArrayList<Member> members = 
			cr.getTeamMembers(team);

		for (Member m: members){      //Går igenom alla members ut members arrayen
			if(m.isParent()){     //betyder automatiskt:  om detta är sant ...
				System.out.println(formaterat(m));
			} 
		}
    }


    public void printMembers(String s) {
		Logger.debugM();
		ArrayList<Member> members = 
			cr.getMembers(s);
		Collections.sort(members, new MemberAlphaComparator());

		System.out.println("Members:");
		for (Member m: members) {
		    System.out.println(formaterar(m));
		}

	}


/*
    public void printTeamMembers(String team) {
			Logger.debugM();
			ArrayList<Member> members = // Returns a list of all the members playing in the team specified by the caller
				cr.getTeamMembers(team);
			Collections.sort(members, new MemberAlphaComparator());

			System.out.println("Members in " + team + ":");
			for (Member m: members) {
			    System.out.println(m);
			}
	    }     
*/

	/*   public void emailMember(int id) {
			Member m = cr.getMember(id);
			if (m==null) { 
				return ; 
			}
			emailMember(m);
			System.out.println("Members:");
			for (Member mem: members) {
			    System.out.println(formaterat(m));
			}
	    }


 /*   public void emailMember(int id) {
		Member m = cr.getMember(id);
		if (m==null) { 
			return ; 
		}
		
		emailMember(m);
   	} */

    public void emailMember(Member m) {
		Logger.debugM();

		ArrayList<Member> parents = 
					cr.getAdults(m);

		System.out.print("Email to " + m.getName() + "");
		if (parents==null || parents.size()==0) { 
		    System.out.println("<" + m.getEmail() + ">"); 
		} 
		else {
		    System.out.println(" via parents:");
		    for (Member p: parents) {
				System.out.println(" * " + p.getName() + "<" + p.getEmail() + ">");
	   		}
		}
    }

    public void printParents(int id) {
		Member m = 
			cr.getMember(id);
		if (m==null) { 
			return ; 
		}
	
    }



}
