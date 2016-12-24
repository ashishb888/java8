/**
 * 
 */
package co.java8.rnd.optional;

import java.util.Optional;

/**
 * @author ashish
 *
 */
public class Computer {

	private Optional<Soundcard> sc = Optional.empty();

	public Optional<Soundcard> getSc() {
		return sc;
	}

	public void setSc(Optional<Soundcard> sc) {
		this.sc = sc;
	}

}
