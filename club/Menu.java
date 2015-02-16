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
			    ch.printMembersAlphaFirstName(); 
			} 
		},"List members in Alphabetical order" );	//Behöver fixas så det blir ordning på förnamn alt  1//Done!-Anna

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembersAlpha(); 
			} 
		},"Medlemmar i ordning på efternamn" );  //Behöver fixas så det blir ordning på efternamn  alt 2 //Rätt

		menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.emailMember(int id)(); 
			} 
		},"Lista medlemmar etfter ID" ); // Behöver fixa så det blir ID alt 3 // Rätt?

		/*menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printTeams(); 
			} 
		},"Lista medlemmar efter lag tillhörigheter" );*/  //Alternativ 4 =lista efter lagtillhörigheter          


		/*menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printMembers(); 
			} 
		},"Lista alla medlemmar i ett lag" ); */ //Alternativ 5 = list amedlemmar i ett lag 

		
		/* menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.printParents(int id); 
			} 
		},"Lista alla föräldrar i ett lag" ); */ //alternativ 6

		/*menu.addMenuItem(new MenuItem(){
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    ch.emailMember(Member m); 
			} 
		},"Lista medlemmar efter e-postadress" );*/ 	//ÄR DETTA RÄTT?! 




		



		menu.addMenuItem(new MenuItem(){ //Skall inte detta (ch.askUser) vara överst?
			public void menuItemSelected(ConsoleMenuEvent e) { 
			    String input = ch.askUser("Enter search string, you bastard: "); 
			    String search = "%" + input.trim() + "%";
			    ch.printMembers(search); 
			}
		},"Search for member" );

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
