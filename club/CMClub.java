package club;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

import tig058.handin01.registry.ClubRegistry;
import tig058.handin01.member.Member;
import tig058.handin01.member.MemberAlphaComparator;
import tig058.handin01.member.MemberAlphaFirstnameComparator;
import tig058.handin01.log.Logger;

//import myprogram.hmi.cli.ClubHelper;

/**
*A class that prints the menu of the user, todays date, a Welcome-text and the menualternatives.
*
*/
public class CMClub {

/**
* A method that prints an automatic input of the user.
*/
    public static void printProp(String s, String prop) {
		String propValue = System.getProperty(prop);
		if (propValue!=null) {
		    System.out.println(s + propValue );
			}
	    }

/**
*The main method, prints the entire menu, including a welcome text with username and date.
*/
	public static void main(String[] args) {

		System.out.println("\n -----===< Club Manager >===----- \n");
		System.out.println("	Welcome To The Club!  ");
		printProp(" 	User:       ", "user.name");
		printProp("  	OS arch:    ", "os.arch");
		printProp("  	OS name:    ", "os.name");
		printProp("  	OS version: ", "os.version");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println(" 	Date:       " + sdf.format(calendar.getTime()));
		System.out.println(" -----=====================-----");
		System.out.println("");

		final ClubHelper ch = new ClubHelper();
		
		if(args.length==0){

		Menu m = new Menu(ch);
		m.run();

		}
/**
*If --member is inprinted by the caller: a list of all members will be listed.
* the method printMembersAll(); is found in CLubHelper 
*/
		else if(args[0].equals("--members")){
			ch.printMembersAll();

/**
*If --teams is inprinted by the caller: a list of all teams will be listed
*the method printMembersAll(); is found in CLubHelper 
*/
		}
		else if(args[0].equals("--teams")){
			ch.printTeamsAll();
			
		}
		
		
   		 }
   	}



 