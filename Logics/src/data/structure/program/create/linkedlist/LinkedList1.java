package data.structure.program.create.linkedlist;

public class LinkedList1 {
	
	private Node head;
	private Node tail;
	
	public LinkedList1() {
		
	}
	
	public void add(Node node){
		Node n = tail.next();
		n = node;
		tail = n;
	}
	
	
}

