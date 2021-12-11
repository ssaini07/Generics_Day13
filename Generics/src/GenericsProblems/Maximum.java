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

	// Taking input as an integer
	public void findMaxInteger() {
		Maximum mx = new Maximum();
		System.out.println("Enter 3 integer numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.println("Your maximum integer number is:" + mx.findMax(num1, num2, num3));
	}

	// Taking input as a float
	public void findMaxFloat() {
		Maximum mx = new Maximum();
		System.out.println("Enter 3 float numbers");
		Scanner sc = new Scanner(System.in);

		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float num3 = sc.nextFloat();

		System.out.println("Your maximum float number is:" + mx.findMax(num1, num2, num3));
	}

	// Take Input as String number
	public void findMaxString() {
		Maximum max = new Maximum();
		System.out.println("Enter 3 String numbers");
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
		max.findMaxInteger();
		max.findMaxString();
	}
}
