/**
 * This simple Hello World programs
 * takes the name as an input and will
 * return "Hello, [name]!" or will just
 * print "Hello, World" if given nothing.
 * 
 * @author Arpan Ghosh
 */
public class HelloWorld {
	
	/** This is the default hello world string. */
	private static String DEFAULT = "Hello, World!";
	
	/**
	 * This method takes a person's name as input
	 * and returns the correct greeting.
	 * @param name The name of the person
	 * @return The greeting with the name of the person.
	 */
    public static String hello(String name) {
    	if ((name == null) || (name.isEmpty())) { 
    		return DEFAULT;
    	}
    	else {
        	return "Hello, " + name + "!";
        }
    }
}
