package club;

//import myprogram.hmi.cli.ClubHelper;
import com.sandklef.edu.ConsoleMenu.*;

public class Menu {
    
    ClubHelper ch ;
    
    public Menu(ClubHelper c) {
		ch = c;
    }

    public void run() {

	   	ConsoleMenu menu = new ConsoleMenu("-----===< Club Manager >===-----");


	   		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			   System.out.println();
			} 
		}," " );


	   	menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembersAlphaFirstName(); 
			} 
		},"List members by first name" );

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembersAlpha(); 
			} 
		},"List members by Surname" );  //Behöver fixas så det blir ordning på efternamn

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembers(); 
			} 

		},"List members in order of ID" );
		
		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printTeams(); 
			} 
		},"List members in order of Team" );

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    String input = ch.askUser("Enter search string for team member: ");
			    String search = "%" + input.trim() + "%";
			    ch.printMembers(search); 
			}
		},"List members in order of " );

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    String input = ch.askUser("Enter search string, Bob Dylan: ");
			    String search = "%" + input.trim() + "%";
			    ch.printMembers(search); 
			}
	  	},"One more coffee" );

	menu.run();
    }

}
