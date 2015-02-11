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
		    System.out.println("du valde Mitt eget..."); } 
	    },"Mitt eget alt" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembers(); } 
	    },"List members" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembersAlpha(); } 
	    },"List members in Alphabetical order" );

	menu.addMenuItem(new MenuItem(){
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
