package club;

import com.sandklef.edu.ConsoleMenu.*;

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


	   	menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembersAlphaFirstName(); 
			} 
		},"List Members in order of First name" ); //Aternativ 1= Medlemmar i alfabetiskt ordning förnamn

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembersAlpha(); 
			} 
		},"List Members in order of Surname" );  //Aternativ 2= Medlemmar i alfabetiskt ordning efternamn

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printID(); 
			} 

		},"List Members in order of ID" ); //Alternativ 3= Medlemmar efter ID
		
		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printTeams();
			    
			} 
		},"List Members in order of Team" ); //Alternatv 4= Lista medlemmar i ordning efter lag

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printTeamMembers();
			    
			} 
		},"List Members of a Team" ); //Alternatv 4= Lista medlemmar i ordning efter lag

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
				
				ch.printParents(); 
			} 
		},"List Parents in a Team" ); //Alternativ 6= Lista alla föräldrar i  ett lag

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
				ch.emailMember(); 
			} 
		},"List E-mails of a Member " ); //Alternativ 7= Lista e-post adresser -> om medlemmen skall e-post användas, om inte skall föräldrarnas e-post användas






	/*	menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    String input = ch.askUser("Enter search string for team member: ");
			    String search = "%" + input.trim() + "%";
			    ch.printMembers(search); 
			}
		},"List members in a Team " ); //Alternativ 5=Lista alla medlemmar i ett lag

	/*	menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    String input = ch.askUser("Enter search string, Bob Dylan: ");
			    String search = "%" + input.trim() + "%";
			    ch.printMembers(search); 
			}
	  	},"One more coffee" ); */

	menu.run();
    }

}

