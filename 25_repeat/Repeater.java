/**
Clueless Cats: Vansh Saboo + Tiffany, Lauren Lee + Bo, Diana Akhmedova + Ajax
APCS
HW25: Do I repeat myself?
2021-10-26
Time Spent: 0.5 hours

DISCO:
- Recursive utilizes if statements as opposed to while loops.
- In creating the functions, we want x to be < numPost, not <= numPost.

QCC:
- In what situation would each method (while loops or recursion) be more practical?
- When we are working with larger numbers and longer cases, which one would be faster?
**/

public class Repeater {

  public static void main(String[]args) {
    System.out.println("While Loop:");
    System.out.println(fenceW(1));
    System.out.println(fenceW(2));
    System.out.println(fenceW(3));

    System.out.println();

    System.out.println("Recursion:");
    System.out.println(fenceR(1));
    System.out.println(fenceR(2));
    System.out.println(fenceR(3));
  }

  public static String fenceW(int numPosts) {
    int x = 1;
    String output = "|";

    while ( x < numPosts ) {
      output = output + "--|";
      x++;
    }
    return output;
  }

  public static String fenceR(int numPosts) {
    if ( numPosts == 1 ) {
      return "|";
    }
    else {
      return fenceR( numPosts - 1 ) + "--|";
    }
  }
}
