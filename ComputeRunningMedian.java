import java.util.*;

public class ComputeRunningMedian {

	private static double round(double value) {
		return Math.round(value * 10.0) / 10.0;
	}

	public static ArrayList<Double> run(ArrayList<Double> list) {

		double sum = 0;
		int count = 0;
		ArrayList<Double> medians = new ArrayList<>();
		for (double operand : list) {
			sum += operand;
			medians.add(round(sum / ++count));
		}

		return medians;
	}

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<>();
		list.add(1.0);
		list.add(0.0);
		list.add(3.0);
		list.add(5.0);
		list.add(2.0);
		list.add(0.0);
		list.add(1.0);
		System.out.println(run(list));
	}
}