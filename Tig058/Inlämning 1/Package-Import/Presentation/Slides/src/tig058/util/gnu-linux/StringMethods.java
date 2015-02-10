package tig058.util;

public class StringMethods{
    /**
     * Returns a new String with the first character
     * capitalized.
     * @param  s the String you want to have an upper case first letter of.
     * @return A new String built on the parameter s,
     *         with the first letter as upper case if it is alphabetic,
     *         otherwise, it returns the String s unchanged.
     * @throws NullPointerException if you call it with null as argument
     */
    public static String ucFirst(String s){
	char first = s.charAt(0);
	char upper = Character.toUpperCase(first);
	if(Character.isAlphabetic(first)){
	    return s.replaceFirst(""+first,
				  ""+upper);
	}else{
	    return s;
	}
    }
}
