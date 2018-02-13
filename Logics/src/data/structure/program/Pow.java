package data.structure.program;

public class Pow {
	
	public static void main(String[] args) {
		Pow pow=new Pow();
		pow.checkNumber(12);
		pow.primeNumbers(9);
	}
	void funtoo(int e){
		int y = 1;
		int count = 0, count1 = 0;
		for (; y <= (int) (e / 2);) {
			y = y * 2;
			count1++;
			if (e % y == 0) {
				count++;
			} else {
				break;
			}
		}
		if(count==count1){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	
	public boolean checkNumber(int num){
		boolean result = false;
		while(num>1){
			if(num%2!=0)
				break;
			num = num/2;
		}
		if(num == 1)
		{	result = true;
			System.out.println("true");
			return result;
		}
		return result;
	}
	
	void primeNumbers(int a)
	{
		int n=2,count=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0){
				n++;
				continue;
			}
			else{
			if(n%i!=0 && i==(n-1))
			{
				System.out.print(n+", ");
				count++;
				n++;
				i=1;
				if(count==a){
					System.out.println("number of elements");
					break;
				}
				else{
					continue;
				}
			}
			}
		}
	}
}
