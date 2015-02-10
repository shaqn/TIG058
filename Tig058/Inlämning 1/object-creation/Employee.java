public class Employee extends Person{
    private long salary; // Monthly salary before taxes

    public Employee(String pNumber, String address, String name, long salary){
	super(pNumber, address, name);
	System.out.println("Employee() ---> ");
	System.out.println("Employee()  salary:         " + this.salary);
	System.out.println("EMployee() ------------------------------------- ");
	this.salary = salary;
	System.out.println("Employee()  salary:         " + this.salary);
	System.out.println("Employee() <--- ");
    }

    public long salary(){
	// Let's pretend we calculate the salary like this:
	return salary;
    }

}
