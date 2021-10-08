/*
Diana Akhmedova (Ajax) + Rin Fukuoka (Tape)
APCS
HW 14 - Customize Your Creation
2021-10-07

DISCO:
- Overloaded constructors use parameters, while default parameters do not.
QCC:
- N/A
*/

public class BigSib {
  String helloMsg;

  public BigSib() {
    helloMsg = "Hello";
  }

  public String greet(String name) {
    return(helloMsg + " " + name);
  }
}
