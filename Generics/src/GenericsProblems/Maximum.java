package GenericsProblems;

import java.util.Scanner;

public class Maximum<T> {

	T meth1;
	T meth2;
	T meth3;

	public Maximum(T meth1, T meth2, T meth3) {
		// super();
		this.meth1 = meth1;
		this.meth2 = meth2;
		this.meth3 = meth3;
	}

	public static <T extends Comparable<T>> T findMax(T meth1, T meth2, T meth3) {

		T max = meth1;

		if (meth2.compareTo(max) > 0) {
			max = meth2;
		}
		if (meth3.compareTo(max) > 0) {
			max = meth3;
		}
		return max;
	}

	public static void main(String[] args) {
		Maximum max = new Maximum(args, args, args);
		System.out.println("Welcome to Generic Practice Problem");
		System.out.println("Max Integer is:" + max.findMax(7, 8, 9));
		System.out.println("Max Float is:" + max.findMax(4.6, 5.3, 6.7));
		System.out.println("Max String is:" + max.findMax("apple", "banana", "peach"));

	}
}