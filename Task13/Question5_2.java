package Task12;

/*
 * String Index Out of Bounds Exception
 */
public class Question5_2 {
	
		public static void main(String[] args) {
			String arrays = "Welcome";
			try {
				char elements = arrays.charAt(8); // Array index 10 is out of bounds (valid indices are 0 to 4)
				System.out.println("Element is:" + elements);
			} catch (StringIndexOutOfBoundsException e) {
				  System.out.println("c occurred: " + e.getMessage());
			}

		}

	}
