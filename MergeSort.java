import java.util.*;

public class MergeSort<T extends Comparable<T>> {

	private void listToHeap(MaxHeap<T> heap, ArrayList<T> list) {
		for (T element : list) {
			heap.add(element);
		}
	}

	public void sort(ArrayList<T> l1, ArrayList<T> l2) {
		MaxHeap<Integer> h1 = new MaxHeap<>();
		MaxHeap<Integer> h2 = new MaxHeap<>();
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