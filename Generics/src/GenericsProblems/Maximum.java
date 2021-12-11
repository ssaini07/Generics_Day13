package GenericsProblems;

import java.util.Scanner;

public class Maximum {

	// Method for finding maximum number (int, float, string)

	public static <T extends Comparable<T>> T findMax(T a, T b, T c) {

		T max = a;

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

	// Take Input as String number
	public void findMaxString() {
		Maximum max = new Maximum();
		System.out.println("Enter 3 String number");
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		String num3 = sc.next();

		System.out.println("Your maximum String number is:" + max.findMax(num1, num2, num3));
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Generic Practice Set");
		Maximum max = new Maximum();
		max.findMaxString();
	}
}
