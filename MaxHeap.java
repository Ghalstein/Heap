import java.util.*;

public class MaxHeap<T extends Comparable <T>> {

	private ArrayList<T> list = new ArrayList<>();
	private int size = 0;

	//bubbles up current index of heap by comparing to parent index, if greater than swaps
	private void bubbleInsert(int curr) {
		int parent = (curr - 1) / 2;
		if (curr == 0) return;
		if (list.get(curr).compareTo(list.get(parent)) > 0) {
			exchange(curr, parent);
			bubbleInsert(parent);
		}
		else {
			return;
		}
	}

	public void add(T data) {
		//checks if heap is empty
		if (size == 0) {
			list.add(data);
		}
		// adds to bottom first and looks to bubble up
		else {
			list.add(data);
			// recursive function will bubble up the insertions until in the right place
			bubbleInsert(size);
		}
		++size;
	}


	// exchange helper method for two points of the heap
	private void exchange(int first, int second) {
		T temp = list.get(first);
		// System.out.println(this.list);
		list.set(first, list.get(second));
		list.set(second, temp);
		// System.out.println(this.list);
	}

	public T peek() {
		return list.get(0);
	}

	public T removeMax() {
		if (size == 1) {
			T temp = list.get(0);
			list.set(0, null);
			return  temp;
		}
		exchange(0, size);

	}

	private void sink(int curr) {
		int child = (curr + 1) * 2;
		if (curr == size) return;
		if (list.get(curr).compareTo(list.get(child)) < 0) {
			exchange(curr, child);
			bubbleInsert(child);
		}
	}

	public static void main(String[] args) {

		MaxHeap<Integer> heap = new MaxHeap<>();
		heap.add(1);
		heap.add(2);
		heap.add(10);
		heap.add(9);
		System.out.println(heap.size);
		System.out.println(heap.list);
		System.out.println(heap.peek());
	}
}