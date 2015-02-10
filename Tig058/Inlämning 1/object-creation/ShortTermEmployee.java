import java.util.Date;

public class ShortTermEmployee extends Employee {

    String endDate;

    public ShortTermEmployee(String pNumber, String address, String name, long salary, String endDate){
	super(pNumber, address, name, salary);
	System.out.println("ShortTermEmployee() ---> ");
	System.out.println("ShortTermEmployee()  endDate:        " + this.endDate);
	System.out.println("ShortTermEmployee() ----------------------------- ");
	this.endDate = endDate;
	System.out.println("ShortTermEmployee()  endDate:        " + this.endDate);
	System.out.println("ShortTermEmployee() <--- ");
    }

}
