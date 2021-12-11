package GenericsProblems;
import java.util.Scanner;

public class Maximum {
	
	 //Method for finding maximum number (int, float, string)
	 
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

	
	public static void main(String[] args) {
		System.out.println("Welcome to Generic Practice Problem");
	}
}
