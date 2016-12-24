/**
 * 
 */
package co.java8.rnd.generic;

/**
 * @author ashish
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericContainer<Integer> integer = new GenericContainer<>();
		integer.setObj(8);
		System.out.println("integer: " + integer.getObj());
		GenericContainer<String> string = new GenericContainer<>();
		string.setObj("string");
		System.out.println("string: " + string.getObj());
	}

}
