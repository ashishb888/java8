/**
 * 
 */
package co.java8.rnd.optional;

import java.util.Optional;

/**
 * @author ashish
 *
 */
public class Soundcard {

	Optional<USB> usb = Optional.empty();

	public Optional<USB> getUsb() {
		return usb;
	}

	public void setUsb(Optional<USB> usb) {
		this.usb = usb;
	}

}
