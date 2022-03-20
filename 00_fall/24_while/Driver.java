/*
Cloudy Caterpillars: Diana Akhmedova + Ajax, Emily Ortiz + Applesauce
APCS
HW24: Get It While You Can
2021-10-25

DISCO:
- this(): default constructor for the object it is referring to.
- The inherited equals method returns true only if the two objects references refer to the same object.
- A while(x) loop "does something" while x is true. It goes on forever, until the condition is no longer true/false.
- The main method executes while loops in the order they were written.

QCC:
- What is the difference between static and non-static? How would we re-write our code without including "static" in front of our variables?

POST-v0 MODS:
- Changed default constructor to use the reset method.
- Added this() in constructors.
- Changed reset to set variables to 0 or the input.
- Simplified flip by deleting unnecessary if and else statements.
- Fixed variables changed in flip method.

Time Spent: 1 hour
*/

public class Driver {

  static int x = 3;
  static int y = 4;
  static int matches = 0;
  static String a;
  static String b;
  static int year = 2005;

  static Coin richard = new Coin();
  static Coin wayne = new Coin("quarter");

  public static void main( String[]args) {
    while( richard.getHeadsCtr() < x ) {
      richard.flip();
      System.out.println("Heads: " + richard.getHeadsCtr());
    }
    System.out.println("Should be " + x + " heads..." + richard.getHeadsCtr());

    richard.reset("penny", 0.5);
    System.out.println();

    while( matches < y ) {
      a = richard.flip();
      b = wayne.flip();

      if( a == b ) {
        System.out.println( "Matchee matchee!" );
        matches += 1;
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      System.out.println("Matches: " + matches);
    }
    System.out.println("Should be " + y + " matches..." + matches + "!");

    matches = 0;
    System.out.println();

    while( matches < 65536 ) {
      a = richard.flip();
      b = wayne.flip();

      if( a == b ) {
        //System.out.println( "Matchee matchee!" );
        matches += 1;
      }
    }

    while( matches % year != 0 ) {
      a = richard.flip();
      b = wayne.flip();

      if( a == b ) {
        //System.out.println( "Matchee matchee!" );
        matches += 1;
      }
    }

    System.out.println(richard.getFlipCtr() + " flips to get " + matches + " matches!");

  }
}
