package strings;

public class Assignment {
	
	public static void main(String[] args) {
		String phrase = new String("The quick brown fox jumps over the lazy dog");
		String s = new String("The quick brown fox jumps over the lazy dog");
		String s1 = new String("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
		System.out.println(phrase.substring(12,13));
		System.out.println("Does the string contain 'is'?" +phrase.contains("is"));
		System.out.println(phrase.concat( " and killed it."));
		System.out.println(phrase.endsWith("dog"));
		System.out.println(phrase.equals(s));
		System.out.println(phrase);
		System.out.println(phrase.equals(s1));
		System.out.println(phrase.length());
		System.out.println(phrase.replace("The", "A"));
		System.out.println(phrase.toLowerCase());
		System.out.println(phrase.toUpperCase());
		System.out.println(phrase.indexOf('a'));
		System.out.println(phrase.lastIndexOf('e'));
		System.out.println(phrase.substring(16,19));
		System.out.println(phrase.substring(40, 43));
	}
	
}
