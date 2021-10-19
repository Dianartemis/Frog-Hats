/**
Clueless Cats: Vansh Saboo + Tiffany, Lauren Lee + Bo, Diana Akhmedova + Ajax
APCS
HW 19: Mo Money Mo Problems ...MORE AWESOME
2021-10-18

DISCO:
- To return true or flase, you must change the return type to boolean.
- You don't need to write an if statement to return a boolean value. Simply returning (xyz) will return true or false depending if it is false or not.
- Don't initialize variables in the if statement if you want it to apply to the else statement too.

QCC:
- Why use constructors instead of regular methods?
- What is the use of static in the heading?
- Why do we need to put (short) in front of the setPin parameter when our pin was within the range of a short?
**/

public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    if( newPin >= 1000 && newPin <= 9998 ) {
      pin = newPin;
    }
    else {
      pin = 9999;
      System.out.println("Try again.");
    }
    return oldPin;
  }

  public int setAcctNum( int newAcctNum ) {
    int oldAcctNum = acctNum; //must be outside of the if statement
    if( newAcctNum >= 100000000 && newAcctNum <= 999999998 ) {
      acctNum = newAcctNum;
    }
    else {
      acctNum = 999999999;
      System.out.println("Try again.");
    }
    return oldAcctNum;
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public Boolean withdraw( double withdrawAmount ) {
    if( balance - withdrawAmount < 0 ) {
      System.out.println("Error.");
      return false;
    }
    else {
      balance = balance - withdrawAmount;
      return true;
    }
  }


  public Boolean authenticate (int inputAcctNum, String inputPassword) {
    if( acctNum == inputAcctNum && inputPassword == passwd ) {
      return true;
    }
    else {
      return false;
    }
    //will return true if true and false if false
  }


  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args ) {
    // should produce a list of all the information
    BankAccount ba = new BankAccount();
    ba.setName("John");
    ba.setPasswd("password");
    ba.setPin((short) 1234);
    ba.setAcctNum(123456789);
    ba.setBalance(0.00);
    ba.deposit(50.00);
    ba.withdraw(10.00);
      //balance should be 40
    System.out.println(ba.toString());

    //should produce errors when setPin, setAcctNum, authenticate, and withdraw are invoked
    BankAccount error = new BankAccount();
    error.setName("Error");
    error.setPasswd("pass");
    System.out.println(error.setPin((short) 12));
    System.out.println(error.setAcctNum(123));
    error.setBalance(0);
    System.out.println(error.withdraw(10));
    System.out.println(error.toString());
    System.out.println(error.authenticate(123, "pass"));
  }//end main()

}//end class BankAccount
