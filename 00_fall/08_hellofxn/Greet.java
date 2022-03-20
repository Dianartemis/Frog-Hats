/*
Diana Akhmedova
APCS
HW 08 - Refactor Freshie Zero
2021-09-30

DISCOVERIES:
- Variables are useful for efficiently outputting something multiple times.
UNRESOLVED QUESTIONS:
- N/A
*/

public class Greet{
  public static void Greet (String name) {
    System.out.println("Why, hello there, " + name + ". How do you do?");
  }

  public static void main (String[]args) {
    Greet("Ajax");
    Greet("the mightiest duck of all");
    Greet("Dr. Ray");
  }
}
