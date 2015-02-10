public class Register{
    public static void main(String[] args){	
	//Person p  = new Person("9001011234", "Lyckliga gatan 1, Uppsala");
	Student  s = new Student("8902032345", "Studentgången 2, Göteborg", "Lisa Student");
	Employee e = new Employee("5002053456", "Avenyn 3, Göteborg", "Kalle Lärare", 30000);
	
	mail(s, "Välkommen till nya utbildningen");
	mail(e, "Välkommen på lärarseminarium");
    }
    // Prints out a postcard with address and message
    private static void mail(Person p, String message){
	String addressLines = p.name() + "\n" + p.address();
	printPostCard(addressLines, message);
    }
    private static void printPostCard(String address, String message){
	// Some code to actually print it...
	System.out.println(address);
	System.out.println(message);
	System.out.println("=================");
    }
}
