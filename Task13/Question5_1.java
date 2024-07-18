package Task12;

/*
 * Array Index Out of Bounds Exception
 */
public class Question5_1 {

	public static void main(String[] args) {
		int[] arrays = { 1, 2, 3, 4, 5, 6 };
		try {
			int elements = arrays[7]; // Array index 10 is out of bounds (valid indices are 0 to 4)
			System.out.println("Element is:" + elements);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds Exception occurred: " + e.getMessage());
		}

	}

}
