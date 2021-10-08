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
