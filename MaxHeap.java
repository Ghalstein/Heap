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

	private void exchange(int one, int two) {
		T temp = list.get(one);
		list.insert()
	}

	public static void main(String[] args) {

	}
}