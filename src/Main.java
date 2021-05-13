
public class Main {

	public static void main(String[] args) {
		// When we pass a primitive to a method, its
		// VALUE is copied. The method cannot change the original
		int x = 10;
		testParameters(x);
		System.out.println(x); // x is still 10

		// When we pass an object to a method, its
		// REFERENCE is copied. The method CAN the original
		Point p = new Point(0, 0);
		testParameters(p);
		System.out.println(p);

		// Understanding check
		Point p2 = new Point(1, 1);
		String str = "cat";
		double d = 3.14;
		tryIt(p2, d, str);

	}

	static void testParameters(int num) {
		num++;
	}

	static void testParameters(Point a) {
		a.setX(5); // Set x-coordinate to 5
		a.setY(2); // Set y-coordinate to 2
	}

	static void tryIt(Point a, double x, String s) {
		s = "cactus";
		x = x * 10;   
		a.setX(3);
		a = new Point(2, 3);
		a.setY(7);
	}

}
