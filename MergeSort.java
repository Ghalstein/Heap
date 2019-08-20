import java.util.*;

public class MergeSort<T extends Comparable<T>> {

	private void listToHeap(MaxHeap<T> heap, ArrayList<T> list) {
		for (T element : list) {
			heap.add(element);
		}
	}

	public ArrayList<T> sort(ArrayList<T> l1, ArrayList<T> l2) {
		MaxHeap<Integer> h1 = new MaxHeap<>();
		MaxHeap<Integer> h2 = new MaxHeap<>();
		ArrayList<T> list = ArrayList<>();
		listToHeap(h1, l1);
		listToHeap(h2, l2);
		while (!h1.isEmpty() || !h2.isEmpty()) {
			if (!h1.isEmpty() && !h2.isEmpty()) {
				T h1Peek = h1.removeMax();
				T h2Peek = h1.removeMax();
				if (h1Peek.comapreTo(h2Peek) > 0) {
					list.add(h1Peek);
					list.add(h2Peek);
				}
				else {
					list.add(h1Peek);
					list.add(h1Peek);
				}
			}
			else if (!h1.isEmpty()) {
				list.add(h1Peek);
			}
			else {
				list.add(h1Peek);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		MaxHeap<Integer> heap = new MaxHeap<>();
		heap.add(1);
		heap.add(2);
		heap.add(10);
		heap.add(9);
		System.out.println(heap);
	}
}