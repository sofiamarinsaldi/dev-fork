/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Exercises on boolean variables and operators
 */

void main() {
	int target = 18;
	System.out.println("target is " + target);
	// TODO: set positive to true if target is greater than zero
	boolean positive = true;
	//per usare un metodo più veloce potevo fare direttamente boolean positive = target > 0
	if (target > 0) {
		positive = true;

	} else {
		positive = false;
	}
	System.out.println("target is positive: " + positive);
}