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
		if (size == 0) return null;
		T temp = list.get(0);
		if (size == 1) {
			list.remove(0);
			--size;
			return  temp;
		}
		else {
			exchange(0, size - 1);
			list.remove(--size);
			sink(0);
			return temp;
		}

	}

	private void sink(int curr) {
		if (curr == 0) {
			if (size >= 3) {
				if (list.get(1).compareTo(list.get(2)) > 0) {
					exchange(curr, 1);
					sink(1);
				}
			}
		}
		if (size == 2) {
			if (list.get(0).compareTo(list.get(1)) < 0) {
				exchange(curr, 1);
			}
		}
		int child = (curr + 1) * 2;
		if (curr == size) return;
		if (size <= child) return;
		if (list.get(curr).compareTo(list.get(child)) < 0) {
			exchange(curr, child);
			sink(child);
		}
		else if (list.get(curr).compareTo(list.get(child - 1)) < 0) {
			exchange(curr, child - 1);
			sink(child - 1);
		}
	}

	public String toString() {
		return this.list.toString();
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		else {
			return false;
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
		System.out.println(heap.list.get(heap.size - 1));
		System.out.println(heap.removeMax());
		System.out.println(heap.list);
	}
}