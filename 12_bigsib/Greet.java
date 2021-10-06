/*
Diana Akhmedova (Ajax) + Rin Fk (Tape)
APCS
HW 12 - On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

DISCO:
- Remove static if the variable is an instance variable.
- Remember to use "void" if you do not want an ouput.
- Declare variables outside of methods.
- You can declare variables without any specific values.
QCC:
- What is an instance variable?
*/

public class Greet {
  public static void main (String[]args) {
    String greeting;

    BigSib richard = new BigSib();

    richard.setHelloMsg("Word up");
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

  } //end main()
} //end Greet
