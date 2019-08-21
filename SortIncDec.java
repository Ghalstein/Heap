import java.util.*;

public class SortIncDec {


	// finds the increment at which the array is increasing and decreasing at
	private static int findIncrement(ArrayList<Integer> list) {
		int count = 1;
		int before = list.get(0);
		while (count < list.size()) {
			if (before < list.get(count)) {
				before = list.get(count++);
			}
			else {
				break;
			}
		}
		return count;
	}

	// sort the array based on the increments
	public static ArrayList<Integer> sort() {
		ArrayList<Integer> list = ArrayList<>();

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		System.out.println(findIncrement(list));
	}
}