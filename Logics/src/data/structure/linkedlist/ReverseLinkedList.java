package data.structure.linkedlist;

public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testCases();
	}

	private static void testCases() {
		Node node = new Node("1", new Node("2", new Node("3", new Node("4",
				new Node("5", null)))));
		System.out.println("Current Node: " + node);
		Node reverse = reverse(node, null);
		System.out.println("reverse:" + reverse);
	}

	/**
	 * {1,2,3,4,5,6} is linked list and and node should be passed;
	 * 
	 * @param currentNode
	 * @param previousNode
	 * @return
	 */
	public static Node reverse(Node currentNode, Node previousNode) {
		Node temp = null;
		if (currentNode == null) {
			return previousNode;
		}
		temp = currentNode.getNextNode();
		currentNode.setNextNode(previousNode);
		// System.out.println("Stack " + ++stack + ": " + currentNode + ", "+
		// previousNode);
		return reverse(temp, currentNode);
	}
}
