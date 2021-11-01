/**
Diana Akhmedova + Ajax
APCS
HW28: PPMP
2021-10-31

DISCO:
- str.toLowerCase() returns the lowercase version of a String.

QCC:
- Why do the methods in CodingBat not include "static", even though we are not dealing with instance variables?

Time Spent: 1.5 hours
**/

public class helloName {

  public static void main( String[]args ) {
    System.out.println( helloName("Bob") );
    System.out.println( helloName("Alice") );
    System.out.println( helloName("X") );
  }

  public static String helloName( String name ) {
    return ("Hello " + name + "!");
  }
}
