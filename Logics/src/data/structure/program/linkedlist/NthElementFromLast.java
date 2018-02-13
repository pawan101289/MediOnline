package data.structure.program.linkedlist;

import java.util.List;

import data.structure.program.linkedlist.CustomLinkedList.Node;

public class NthElementFromLast {
	
	public static void main(String[] args) {
		CustomLinkedList linkedList = new CustomLinkedList();
		//Add Nodes in CustomLinkedList
		addDataToCustomLinkedList(linkedList);
		
		findNthElementFromLast(linkedList, 6);
	}

	private static void findNthElementFromLast(CustomLinkedList linkedList, int i) {
		
		
	}
	
	/**
	 * Add data to CustomLinkedList
	 * @param linkedList
	 */
	public static void addDataToCustomLinkedList(CustomLinkedList linkedList){
		for (int i = 0; i < 20; i++) {
			Node node = linkedList.new Node(i);
			linkedList.add(node);
		}
		Node node = linkedList.new Node(14);
		linkedList.add(node, 12);
		boolean threefour = linkedList.add(node, 34);
		System.out.println(threefour);
		List<Node> nodes = linkedList.getNodes();
		for (Node node2 : nodes) {
			System.out.print(node2.getData()+ ": next: "+node2.getNext()+ " , ");
		}
	}

}
