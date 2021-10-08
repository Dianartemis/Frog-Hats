public class BigSib {
  private String helloMsg;

  public BigSib() {
    helloMsg = "Word up";
  }

  public BigSib(String msg) {
    helloMsg = msg;
  }

  public String greet(String name) {
    return(helloMsg + " " + name);
  }
}
