package data.structure.program;

public class GCD {

	public static void main(String[] args) {
		int gcd = findGCD(21, 23);
		System.out.println(gcd);
	}

	public static int findGCD(int low, int high) {
		int remainder = high%low;
		if(remainder==0) {
			return low;
		}
		return findGCD(remainder,low);
	}

}
