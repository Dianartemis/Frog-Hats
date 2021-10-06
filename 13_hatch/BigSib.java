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
