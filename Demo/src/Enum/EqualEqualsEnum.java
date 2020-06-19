package Enum;
enum Color { BLACK, WHITE };
enum Chiral { LEFT, RIGHT };

public class EqualEqualsEnum {
public static void main(String[] args) {
	Color nothing = null;
	if (nothing == Color.BLACK);      // runs fine
	if (nothing.equals(Color.BLACK)); // throws NullPointerException
	
	
	// == is subject to type compatibility check at compile time
	// equals is subject to value 
	
	// equal is check at compile time
	
	
	if (Color.BLACK.equals(Chiral.LEFT)); // compiles fine
	//if (Color.BLACK == Chiral.LEFT);      // DOESN'T COMPILE!!! Incompatible types!
}
}
