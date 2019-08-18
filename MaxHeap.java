public class MaxHeap<T extends Comparable <T>> {

	//head node of the MaxHeap
	private Node root = null;

	// max heap constructor
	public MaxHeap(T data) {
		this.root = new Node(data);
	}

	// innerclass Node for Heap class
	class Node {

		public Node(T data) {
			this.data = data;
		}

		// data sotred inside a node
		protected T data;
		protected Node right;
		protected Node left;
	}


	public static void main(String[] args) {

	}
}