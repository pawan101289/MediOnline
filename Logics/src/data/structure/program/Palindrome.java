package data.structure.program;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.check(false, "hellEh");
		palindrome.check(true, "hellEh");
		palindrome.check(202202);
	}

	/**
	 * case-insensitive checking
	 * 
	 * @param String
	 *            s
	 * @return boolean
	 */
	public boolean check(boolean b, String s) {
		char[] charArray = s.toCharArray();
		int j = charArray.length - 1;
		for (int i = 0; i < charArray.length / 2; i++) {
			char charStart = (Character) charArray[i];
			char charEnd = (Character) charArray[j--];

			// case-sensitive
			if (charStart != charEnd && b == true) {
				System.out.println("going to return false case sensitive " + s);
				return false;
			}

			// case-insensitive
			if (!(Character.toString(charStart)).equalsIgnoreCase((Character
					.toString(charEnd)))
					&& b == false) {
				System.out.println("ignore case return false case-insensitive "
						+ s);
				return false;
			}
		}
		System.out.println("going to return true for case-sensitivity " + b
				+ " String " + s);
		return true;
	}

	public boolean check(int old) {
		int newint = 0, z = 0, oldint = old;
		
		while (oldint > 0) {
			z = oldint % 10;
			oldint = oldint / 10;
			newint = newint * 10 + z;
			if(newint==0){
				newint=newint+10;
			}
		}
		if (newint == old) {
			System.out.println("the nuber in palindrome");
			return true;
		}
		System.out.println("the number is not a palindrome");
		return false;
	}
}
