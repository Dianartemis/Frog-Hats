/*
Clueless Cats: Vansh Saboo + Tiffany, Lauren Lee + Bo, Diana Akhmedova + Ajax
APCS
HW 18: CPA-One
2021-10-14

DISCO:
- Non-static variable cannot be reference in a static context (ie: static method).
- Constructors were not working for this problem.

QCC:
- Are constructors considered methods?
- Would constructors be considered methods in a UML diagram?
- How is the functionality of the static and instance variable different (because the work we do right now seems to use them interchangeably)?
- How do we use constructors to fill in information?

Clueless Cats's Latest and Greatest Q2 Response:
- A default contructor is already defined/provided by Java because we can initialize balance without any parameters.

Clueless Cats's Latest and Greatest Q3 Response:
- Create a sample method that returns an integer.
- In a separate method with a String return method, convert the integer to a string:
      (str) <int>
- Return this String.
*/

public class BankAccount {
  // creating static variables for each attribute
  private static String name;
  private static String password;
  private static int pin;
  private static int accountNum;
  private static float balance;

  // setting each attribute
  public static void setName(String fullName) {
    name = fullName;
  }

  public static void setPass(String newPass) {
    password = newPass;
  }

  public static void setPin(int newPin) {
    pin = newPin;
  }

  public static void setAccNum(int accNum) {
    accountNum = accNum;
  }

  public static void setBalance() {
    balance = 0;
  }

  // printing out info
  public static void printInfo (int accNum, String pass){
    if (accNum == accountNum && pass == password){
      // if account number + password are correct, print info
      System.out.println(name);
      System.out.println(password);
      System.out.println(pin);
      System.out.println(accountNum);
      System.out.println(balance);
    }
    else{
      // if not correct, print error message
      System.out.println("Your password or account number is wrong.");
    }
  }

  public static void deposit (int accNum, String pass, float amtDeposit) {
    if(accNum == accountNum && pass == password) {
      // if account number + pass are correct, deposit money
      balance = balance + amtDeposit;
      System.out.println("Your new balance is now " + balance + ".");
    }
    else {
      // if not correct, no deposit
      System.out.println("Your username or password is incorrect.");
    }
  }

  public static void withdraw (int accNum, String pass, float amtWithdraw) {
    if(accNum == accountNum && pass == password) {
      if(balance - amtWithdraw < 0) {
        // does not allow withdrawal when balance will be less than 0
        System.out.println("You're broke, you can't withdraw money.");
        }
        else {
          // if account number + pass are correct AND money is less than 0, withdraw money
          balance = balance - amtWithdraw;
          System.out.println("Your new balance is now " + balance + ".");
        }
      }
    else {
      // if not correct, no withdraw
      System.out.println("Your username or password is incorrect.");
    }
  }

  public static void main (String[] args) {
    // sets info
    setName("John Doe");
    setPass("password");
    setPin(1234);
    setAccNum(123456789);
    setBalance();

    // prints info
    printInfo(123456789, password);

    // deposit test
    deposit(123456789, password, 50);

    // withdraw test
    withdraw(123456789, password, 40);
    // withdrawing too much money test
    withdraw(123456789, password, 20);

    // withdraw + deposit with wrong information test
    deposit(12345, password, 20);
    withdraw(12345, password, 20);

    // prints updated info
    printInfo(123456789, password);
  }
}
