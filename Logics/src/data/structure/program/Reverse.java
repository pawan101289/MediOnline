package data.structure.program;

public class Reverse {

	public static void main(String[] args) {
		Reverse reverse=new Reverse();
		reverse.reversal("hello How re you");
	}

	private void reversal(String string) {
		char[] c=string.toCharArray();
		for(int i=c.length-1;i>-1;i--){
			System.out.print(c[i]);
		}
	}
}
