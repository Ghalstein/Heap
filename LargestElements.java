import java.util.*;

public class LargestElements {

	// finds the k largest lelemtns in an array
	public static ArrayList<Integer> compute(int k, ArrayList<Integer> arr) {
		ArrayList<Integer> largest = new ArrayList<>();
		MaxHeap<Integer> heap = new MaxHeap<>();
		for (int curr : arr) {
			heap.add(curr);
		}
		for (int i = 0; i < k; ++i) {
			largest.add(heap.removeMax());
		}
		return largest;
	}

	public static void main(String[] args) {

	}
}