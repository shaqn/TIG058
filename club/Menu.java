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

<<<<<<< HEAD
	   		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			   System.out.println();
			} 
		}," " );

=======
>>>>>>> parent of 1aafa19... Vet inte vad men tydligen 10 förändringar
	   	menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembersAlpha(); 
			} 
		},"List members in Alphabetical order" );	//Behöver fixas så det blir ordning på förnamn

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembersAlpha(); 
			} 
		},"Medlemmar i ordning på efternman" );  //Behöver fixas så det blir ordning på efternamn

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembers(); 
			} 
<<<<<<< HEAD
		},"List members in order of ID" );
		
		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printTeams(team); 
			} 
		},"List members in order of Team" );
		
=======
		},"List members" );

>>>>>>> parent of 1aafa19... Vet inte vad men tydligen 10 förändringar
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
