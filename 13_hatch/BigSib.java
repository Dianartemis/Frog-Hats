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


public class BigSib {
  String helloMsg;
  public BigSib(String msg) {
    helloMsg = msg;
  }

  public String greet (String name) {
    return(helloMsg + " " + name);
  }

  public void setHelloMsg (String msg) {
    helloMsg = msg;
  }
}
