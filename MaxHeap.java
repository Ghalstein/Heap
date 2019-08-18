import java.util.*;

public class MaxHeap<T extends Comparable <T>> {

	private ArrayList<T> list = new ArrayList<>();
	private int size = 0;

	public void insert(T data) {

		if (size == 0) {
			list.add(data);
		}
	}

	public static void main(String[] args) {

	}
}