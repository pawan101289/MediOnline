package data.structure.program.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class CustomLinkedList {
	
	private List<Node> nodes;
	
	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	class Node {
		
		private Node next;
		private Object data;
		
		public Node(final Object data){
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Object getData() {
			return data;
		}
		
		
	}
	
	/**
	 * Add Node at last
	 * @param node
	 * @return
	 */
	public boolean add(Node node){
		return add(node, -1);
	}
	
	/**
	 * Add element at any position
	 * @param node
	 * @param index
	 * @return
	 */
	public boolean add(Node node, int index){
		boolean added = true;
		if(nodes==null){
			nodes = new ArrayList<>();
			nodes.add(node);
		}
		System.out.println("Node with Data : "+node.getData()+" ; index : "+index+" Nodes size :  "+nodes.size());
		if(index<0){
			Node previous = nodes.get(nodes.size()-1);
			previous.setNext(node);
			nodes.add(node);
			System.out.println("in if --> Nodes size "+nodes.size());
			return added;
		}else if(index>0 && index<nodes.size()){
			Node previousNode = nodes.get(index-1);
			Node nextNode = nodes.get(index);
			previousNode.setNext(node);
			node.setNext(nextNode);
			nodes.add(index, node);
			System.out.println("in first else if --> Nodes size "+nodes.size());
			return added;
		}else if(index==0 ){
			Node firstNode = nodes.get(0);
			node.setNext(firstNode);
			nodes.add(0, node);
			System.out.println("in second else if --> Nodes size "+nodes.size());
			return added;
		}
		return false;
	}

}
