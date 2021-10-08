/*
Neverland (Diana Akhmedova + Ajax, Rin Fukuoka + Tape, Marcus Wu)
APCS
HW 14 - Customize Your Creation
2021-10-07

DISCO:
- Overloaded constructors use parameters, while default parameters do not.
QCC:
- N/A
*/

public class Greet {
  public static void main (String[]args) {
    String greeting;

    BigSib richard = new BigSib("Word up");
    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib spaceman = new BigSib("Salutations");
    greeting = spaceman.greet("Dr. Spaceman");
    System.out.println(greeting);

    BigSib kong = new BigSib("Hey ya");
    greeting = kong.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib mom = new BigSib("Sup");
    greeting = mom.greet("mom");
    System.out.println(greeting);
  }
}
