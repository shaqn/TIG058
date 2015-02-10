package something;

/**
 * 
 * A marvellous class to print out the starting lines of song from the 80's
 * Hmmm, brings me back to Roskilde 1992... another day!
 *
 */
public class Hello {

    /**
     * A method to print out a String.
     * 
     * @param s String to print
     * 
     */
    public void say(String s) {
	System.out.println(s);
    }

    /**
     * A method to print out "Hello".
     * 
     */
    public void sayHello() {
	/* This is not a javadoc comment, 
	   let's call say instead of calling System.out.println
	   For the fun of it ;) */
	say("Hello");
    }

    public static void main(String[] args) {

	// - Hmmmm, do we have a constructor with no parameters?
	// - No... how does that work
	// - Well, java creates a default constructor for us if we have no constructors
	// - Nice, I guess? But what happens if we crate a constructor
	//   (Boa Constructor?) with a few parameters. Does Java still make one with no args for us?
	// - No. And don't create an empty yourself!!!!
	Hello h = new Hello();

	h.sayHello();
	h.say(".. is it me you're looking for?");
    }

}
