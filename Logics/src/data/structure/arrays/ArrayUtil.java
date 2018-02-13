package data.structure.arrays;

public class ArrayUtil {
	
	public static String print(Object [] arr){
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (Object object : arr) {
			sb.append(object.toString()+",");
		}
		sb.replace(sb.length()-1, sb.length(), "}");
		return sb.toString();
	}

}
