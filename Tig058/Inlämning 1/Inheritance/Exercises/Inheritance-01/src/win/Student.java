import java.util.ArrayList;
public class Student extends Person{

    private ArrayList<String> courses;
    
    public Student(String pNumber, String address, String name){
	super(pNumber, address, name); // Använd superklassens konstruktor
	courses = new ArrayList<String>();	
    }

    public void enroll(String course){
	courses.add(course);
    }
    
    //... fler metoder...
}
