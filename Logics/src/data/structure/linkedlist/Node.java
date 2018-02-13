package data.structure.linkedlist;

public class Node {
	private Node nextNode;
	private String data;

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node(String current, Node next) {
		this.data = current;
		this.nextNode = next;
	}

	@Override
	public String toString() {
		if (this != null) {
			StringBuilder sb = new StringBuilder();
			sb.append(this.data);
			Node next = this.nextNode;
			while (next != null) {
				sb.append("-->");
				sb.append(next.data);
				next = next.nextNode;
				continue;
			}
			return sb.toString();
		} else {
			return null;
		}
	}
}
