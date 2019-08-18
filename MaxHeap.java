import java.util.*;

public class MaxHeap<T extends Comparable <T>> {

	private ArrayList<T> list = new ArrayList<>();
	private int size = 0;

	public void insert(T data) {

		//checks if heap is empty
		if (size == 0) {
			list.add(data);
		}
		// adds to bottom first and looks to bubble up
		else {
			list.add(data);
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