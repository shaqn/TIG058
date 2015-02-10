public class Employee extends Person{
    private long salary; // Monthly salary before taxes
    private static long CHRISTMAS_BONUS = 1000;
    public Employee(String pNumber, String address, String name, long salary){
	super(pNumber, address, name);
	this.salary = salary;
    }
    public long salary(){
	// Let's pretend we calculate the salary like this:
	return salary+CHRISTMAS_BONUS;
    }
}
