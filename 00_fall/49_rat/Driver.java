/**
Team Orange Marshmellows: Julia Kozak, Nina Jiang, Diana Akhmedova // Duckies: Flopsy, Miss Alpaca, Ajax
APCS pd08
HW49 -- Rational Standards Compliance
2021-12-23
Time Spent: 0.5 hrs
**/

/**
DISCO:
- If an object uses the constructor of a certain class type, it can be typecasted as that class type.
- Even if java is told to throw the error, the object must still be typecasted as a Rational since java may still not know that it's a Rational type.
- Rational implementing Comparable means that Rational is a type of Comparable.
- Object instanceof Class is used to test whether the object is an instance of the specified type. It is a boolean.
QCC:
- If asking to run .equals() with a non-Rational object throws an error, is there a way to have the proceeding calls in the main method still run?
- Why can't we just use compareTo instead of equals?
**/

public class Driver {
	public static void main(String[] args) {
		Object a = new Rational(1, 2);
		Rational b = new Rational(2, 3);
		Rational d = new Rational(2, 3);
		Object c = new Object();

		System.out.println(b.compareTo(a));

		System.out.println(b.equals(a));
		System.out.println(b.equals(d));

		System.out.println(b.compareTo(c));
	}
}
