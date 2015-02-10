import java.util.Calendar;

public class Person{
    private String personalNumber;
    private String address;
    private String name;
    public Person(String personalNumber, String address, String name){
	this.personalNumber = personalNumber;
	this.address = address;
	this.name=name;
    }
    public int age(){
	// räkna ut och returnera ålder
	return calculateAge();
    }

    public String address(){
	return address;
    }

    public String name(){
	return name;
    }

    private long getBirthNumber(){
	// Vi vill bara ha kvar de sex första siffrorna
	long pNum = Long.parseLong(personalNumber);
	long birthNumber=pNum/10000;
	return birthNumber;


    }
    private int calculateAge(){
	// Egentligen räknar vi ut åldern men för att spara plats
	// så fejkar vi detta och returnerar 30 här.
	return 30;
	// Vill ni se ett exempel på hur man kan räkna ut åldern,
	// se filen PersonWithAge.java
    }
}
