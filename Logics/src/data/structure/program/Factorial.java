package data.structure.program;

public class Factorial {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		System.out.println(factorial.fact(5));
	}

	private int fact(int i) {
		if(i==1){
			return i;
		}
		else{
			return (i*fact(i-1));
		}
	}

}
