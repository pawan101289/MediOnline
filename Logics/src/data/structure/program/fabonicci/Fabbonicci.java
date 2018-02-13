package data.structure.program.fabonicci;

import java.util.HashMap;
import java.util.Map;

public class Fabbonicci {

	static Map<Integer, Pair> cachemap = new HashMap<>();
	
	public static void main(String[] args) {
		for(int i = 0; i<21;i++){
			System.out.print(fabbonicciIterator(i)+" , ");
			if(i%10==0){
				System.out.println();
			}
		}
	}

	public static int fabbonicciIterator(int number){
		if(cachemap.containsKey(number-1)){
			Pair pairData = cachemap.get(number-1);
			return pairData.getValue() + pairData.getKey();
		}
		int first=0,previous = 1, current = 0;
		for(int i=0;i<number;i++){
			first = previous;
			previous = current;
			current = first + previous;
		}
		Pair pair = new Pair();
		pair.setKey(current);
		pair.setValue(previous);
		cachemap.put(number, pair);
		return current;
	}
	
}
