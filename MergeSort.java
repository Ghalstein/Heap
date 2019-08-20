import java.util.*;

public class MergeSort {

	private static void listToHeap(MaxHeap<Integer> heap, ArrayList<Integer> list) {
		for (int element : list) {
			heap.add(element);
		}
	}

	public static ArrayList<Integer> sort(ArrayList<Integer> l1, ArrayList<Integer> l2) {
		MaxHeap<Integer> h1 = new MaxHeap<>();
		MaxHeap<Integer> h2 = new MaxHeap<>();
		ArrayList<Integer> list = new ArrayList<>();
		listToHeap(h1, l1);
		listToHeap(h2, l2);
		while (!h1.isEmpty() || !h2.isEmpty()) {
			System.out.println(list);
			if (!h1.isEmpty() && !h2.isEmpty()) {
				int h1Peek = h1.removeMax();
				int h2Peek = h1.removeMax();
				if (h1Peek > h2Peek) {
					list.add(h1Peek);
					list.add(h2Peek);
				}
				else {
					list.add(h1Peek);
					list.add(h1Peek);
				}
			}
			else if (!h1.isEmpty()) {
				int h1Peek = h1.removeMax();
				list.add(h1Peek);
			}
			else {
				int h2Peek = h1.removeMax();
				list.add(h2Peek);
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
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(15);
		l1.add(1);
		l1.add(8);
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(2);
		l2.add(1);
		l2.add(10);
		l2.add(3);
		System.out.println(MergeSort.sort(l1, l2));
	}
}