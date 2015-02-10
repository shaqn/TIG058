public class Person {

    private String personalNumber;
    private String address;
    private String name;

    public Person(String personalNumber, String address, String name){
	System.out.println("Person() ---> ");
	System.out.println("Person()  personalNumber: " + this.personalNumber);
	System.out.println("Person()  address:        " + this.address);
	System.out.println("Person()  name:           " + this.name);
	System.out.println("Person() ------------------------------------- ");
	this.personalNumber = personalNumber;
	this.address = address;
	this.name=name;
	System.out.println("Person()  personalNumber: " + this.personalNumber);
	System.out.println("Person()  address:        " + this.address);
	System.out.println("Person()  name:           " + this.name);
	System.out.println("Person() <--- ");
    }
    public int age(){
	// räkna ut och returnera ålder
	return 88; // fejk, räknas ut av personnumret
    }

    public String address(){
	return address;
    }

    public String name(){
	return name;
    }

    @Override
    public boolean equals(Object o){
	//if (o==null || o.getClass() != this.getClass()){
	if (o==null || !(o instanceof Person) ){
	    return false; // Can't be equal if you're null or different class!
	}else{
	    return ((Person)o).personalNumber.equals(this.personalNumber);
	}
    }

    

}
