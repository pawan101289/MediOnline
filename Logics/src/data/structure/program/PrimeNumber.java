package data.structure.program;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber number=new PrimeNumber();
		number.whetherPrime(4);
	}

	private void whetherPrime(int i) {
		int j=(int) Math.ceil(Math.sqrt((double)i));
		for(int z=2;z<=j;z++){
			if(i%z==0){
				System.out.println(i+" i is not prime");
				break;
			}
			else {
				if(z==j){
					System.out.println("i is prime "+i);
				}
			}
		}
		uptoNumber(i);
	}
	
	private void uptoNumber(int i) {
        
	}

}
