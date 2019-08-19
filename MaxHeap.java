import java.util.*;

public class MaxHeap<T extends Comparable <T>> {

	private ArrayList<T> list = new ArrayList<>();
	private int size = 0;

	//bubbles up current index of heap by comparing to parent index, if greater than swaps
	public void bubbleInsert(int curr) {
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

	public void insert(T data) {
		++size;
		//checks if heap is empty
		if (size == 0) {
			list.add(data);
		}
		// adds to bottom first and looks to bubble up
		else {
			list.add(data);
			bubbleInsert(size - 1);
			// making an exchange method first

		}
	}


	// exchange helper method for two points of the heap
	private void exchange(int first, int second) {
		T temp = list.get(first);
		list.add(first, list.get(second));
		list.add(second, temp);
	}

	public static void main(String[] args) {

	}
}