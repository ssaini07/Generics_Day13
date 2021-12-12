package GenericsProblems;

import java.util.Arrays;
import java.util.List;

public class Maximum<T extends Comparable<T>> {

	public static <T extends Comparable<T>> T findMaxMethod(List<T> array) {

		T max = array.get(0);
		for (T key : array) {
			if (key.compareTo(max) > 0)
				max = key;
		}
		return max;
	}

	public static <T extends Comparable> T printMax() {
		System.out.println("Here calling findMaxMethod through printMax");
		System.out.println("The Maximum integer num is:" + findMaxMethod(Arrays.asList(9, 12, 22, 76, 439, 29)));
		System.out.println("The Maximum float num is:" + findMaxMethod(Arrays.asList(1.9, 32.9, 63.7, 22.6, 12.4, 11.3)));
		System.out.println("The Maximum String  is:"
				+ findMaxMethod(Arrays.asList("Apple", "Blueberry", "Orange", "Cauliflower", "Onion")));
		return null;

	}

	public static void main(String[] args) {
		System.out.println("the Max Value is: ");

		printMax();

	}
}