import java.util.*;

public class LargestElements {

	// finds the k largest lelemtns in an array
	public static ArrayList<Integer> compute(int k, ArrayList<Integer> arr) {
		ArrayList<Integer> largest = new ArrayList<>();
		MaxHeap<Integer> heap = new MaxHeap<>();
		for (int curr : arr) {
			heap.add(curr);
		}
		System.out.println(heap);
		for (int i = 0; i < k; ++i) {
			largest.add(heap.removeMax());
		}
		return largest;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(12);
		list.add(20);
		System.out.println(compute(5, list));
	}
}