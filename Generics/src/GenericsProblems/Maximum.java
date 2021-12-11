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
	
	// Take Input as float number
		public void findMaxFloat() {
			Maximum max = new Maximum();
			System.out.println("Enter 3 float number");
			Scanner sc = new Scanner(System.in);
			float num1 = sc.nextFloat();
			float num2 = sc.nextFloat();
			float num3 = sc.nextFloat();

			System.out.println("Maximum float number is:" + max.findMax(num1, num2, num3));
		}

	public static void main(String[] args) {
		System.out.println("Welcome to Generic Practice Problem");
		Maximum max = new Maximum();
		max.findMaxFloat();
	}
}
