import java.util.*;

public class ComputeRunningMedian {

	public static ArrayList<Double> run(ArrayList<Double> list) {

		double sum = 0;
		int count = 0;
		ArrayList<Double> medians = new ArrayList<>();
		for (double operand : list) {
			sum += operand;
			medians.add(sum / ++count);
		}

		return medians
	}

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(0);
		list.add(1);
		System.out.println()
	}
}