/*
Diana Akhmedova (Ajax) + Rin Fk (Tape)
APCS
HW 13 - Where do BigSibs Come From?
2021-10-06

DISCO:
- Must include parameters in a construction (ex: public BigSib(String msg))
- A constructor must be public.
QCC:
- Why does a constructor have to be public?
*/

public class Greet {
  public static void main (String[]args) {
    String greeting;

    BigSib richard = new BigSib("Word up");
    greeting = richard.greet("freshman");
    System.out.println(greeting);

    richard.setHelloMsg("Salutations");
    greeting = richard.greet("Dr. Spaceman");
    System.out.println(greeting);

    richard.setHelloMsg("Hey ya");
    greeting = richard.greet("Kong Fooey");
    System.out.println(greeting);

    richard.setHelloMsg("Sup");
    greeting = richard.greet("mom");
    System.out.println(greeting);
  }
}
