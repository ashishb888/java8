/**
 * 
 */
package co.java8.rnd.optional;

import java.util.Optional;

/**
 * @author ashish
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.getSc().ifPresent(System.out::println);

		Soundcard soundcard = new Soundcard();
		Optional<Soundcard> sc = Optional.of(soundcard);
		comp.setSc(sc);
		comp.getSc().ifPresent(System.out::println);
	}

}
