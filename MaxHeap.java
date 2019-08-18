public class MaxHeap<T extends Comparable <T>> {

	private Node root = null;

	public MaxHeap(T data) {
		this.root = new Node(data);
	}
	class Node {

		public Node(T data) {
			this.data = data;
		}

		protected T data;
		protected Node right;
		protected Node left;
	}


	public static void main(String[] args) {

	}
}