package data.structure.program.create.linkedlist;

import java.util.LinkedList;

public class MiddleElement {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < 20; i++) {
			linkedList.add(i);
		}
		findNthElementFromLast(linkedList, 6);
	}

	private static void findNthElementFromLast(LinkedList<Integer> linkedList, int i) {
		System.out.println(linkedList.getLast());
		
	}

}
