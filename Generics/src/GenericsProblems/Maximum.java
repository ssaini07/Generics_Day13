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
	
	// Take Input as integer number
		public void findMaxInteger() {
			Maximum max = new Maximum();
			System.out.println("Enter 3 integer number");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();

			System.out.println("Maximum integer number is:" + max.findMax(num1, num2, num3));
		}

	public static void main(String[] args) {
		System.out.println("Welcome to Generic Practice Problem");
		Maximum max = new Maximum();
		max.findMaxInteger();
	}
}
