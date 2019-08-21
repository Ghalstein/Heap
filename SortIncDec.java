public class SortIncDec<T extends Comparable <T>> {

	private static int findIncrement(ArrayList<T> list) {
		int count = 1;
		int before = list.get(0)
		while (count < list.size()) {
			if (before < list.get(count)) {
				before = list.get(count++);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(findIncrement())
	}
}