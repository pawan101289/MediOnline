package data.structure.program.create.linkedlist;

public class Node {
	
	private Node next;
	private Object data;
	
	public Node( Object data) {
		this.data = data;
	}
	
	public Node next(){
		return this.next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
}
