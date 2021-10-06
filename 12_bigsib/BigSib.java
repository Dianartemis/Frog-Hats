/*
Diana Akhmedova + Rin Fk
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

public class BigSib {
  String helloMsg;
  public String greet (String name) {
    return(helloMsg + " " + name);
  }

  public void setHelloMsg (String msg) {
    helloMsg = msg;
  }
}
