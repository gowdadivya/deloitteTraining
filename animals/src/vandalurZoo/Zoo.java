package vandalurZoo;
import org.animals.*;
public class Zoo {
	public static void main (String args[]) {
		Lion lion = new Lion();
		System.out.println("\ncharacteristics of lion");
		lion.canClimb();
		lion.isVegetarian();
		lion.printChar();
		Elephant elephant = new Elephant();
		System.out.println("\nCharacteristics of Elephant");
		elephant.canClimb();
		elephant.isVegetarian();
		elephant.printChar();
		Monkey monkey = new Monkey();
		System.out.println("\nChars of Monkey");
		monkey.canClimb();
		monkey.isVegetarian();
		monkey.printChar();
	}

}
