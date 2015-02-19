package club;

import com.sandklef.edu.ConsoleMenu.*;

/**
* A class that contains options for the menu.
* Returns calls (anrop?) from ClubHelper.
*
*/
public class Menu {
    
    ClubHelper ch ;


    
    public Menu(ClubHelper c) {
		ch = c;
    }

    public void run() {

	   	ConsoleMenu menu = new ConsoleMenu("-----===< Club Manager >===----- \n");


	   		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			   System.out.println();
			} 
		}," " );
/**
* Aternative 1= Members in alphabetic order by first name.
* Calls for the method  printMembersAlphaFirstName(); in ClubHelper.
*/
	   	menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembersAlphaFirstName(); 
			} 
		},"List Members in order of First name" ); 
/**
*Aternative 2= Members in alphabetic order by surname.
*Calls for the method  printMembersAlpha(); in ClubHelper.
*/
		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembersAlpha(); 
			} 
		},"List Members in order of Surname" );  

/**
*Alternative 3= Members in order by ID.
*calls for the method  printID(); in ClubHelper.
*/
		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printID(); 
			} 

		},"List Members in order of ID" ); 
		
/*
*Alternative 4= Members in order by Teams.	
*calls for the method printTeams(); in ClubHelper.
*/		
		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printTeams();
			    
			} 
		},"List Members in order of Team" ); 


/*
*Alternatv 4= Lists members in order of team.
*calls for the method  printTeamMembers(); in ClubHelper.
*/
		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printTeamMembers();
			    
			} 
		},"List Members of a Team" ); 

/*
* Alternativ 6= Lists all parents in a team.
* Calls for the method  printParents(); in ClubHelper.
*/
		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
				
				ch.printParents(); 
			} 
		},"List Parents in a Team" ); 

/*
*Alternativ 7= Lists email of a member: if the member is not an adult (18y/o): the email adress of the parents will be listed.
*Calls for the method emailMember(); in ClubHelper.
*/
		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
				ch.emailMember(); 
			} 
		},"List E-mails of a Member " ); 


	menu.run();
    }

}

