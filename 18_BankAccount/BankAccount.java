/*
Clueless Cats: Vansh saboo + Tiffany, Lauren Lee + Bo, Diana Akhmedova + Ajax
APCS
HW 18: CPA-One
2021-10-14

DISCO:
QCC:
Clueless Cats's Latest and Greatest Q2 Response:
Clueless Cats's Latest and Greatest Q3 Response:
*/

public class BankAccount {
  public String name;
  private String password;
  private int pin;
  public int accountNum;
  private float balance;

  public static void main (String[] args) {
	System.out.println(printInfo(

	setName("Chris Lu");
	setPassword ("12345");
	setPin (1234);
	set accountNum
  public static String setName (String firstLast) {
    name = firstLast;
  }

  public static String setPassword (String newPassword) {
    password = newPassword;
  }

  public static int setPin (int newPin) {
    pin = newPin;
  }

  public static String printinfo (int account, String pass){
	if (account == accountNum && pass = password){
                return (name "\n" password "\n"(str) pin "\n" accountNum "\n" balance);	
	}else{
		return ("Your password or account number is wrong.");
	}
}

  public static float deposit  (float amtDeposit) {
	balance = balance + amtDeposit;
	return balance;
}

  public static float withdraw (float amtWithdraw) {
	balance = balance - amtWithdraw;
	return balance;
}
