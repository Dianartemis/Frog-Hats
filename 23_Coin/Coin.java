/**
Cloudy Caterpillars: Diana Akhmedova + Ajax, Emily Ortiz + Applesauce
APCS
HW23: What Does Equality Look Like?
2021-10-23

DISCO:
- Accessor methods allow you to access a private variable/instance variable in another class.
- java.util.Random imports the Random class.
- Random rand = new Random() makes an instance of the class Random.
- int num = rand.nextInt(10) sets num to a random integer between 0 and 10.
- || means "or" in Java, while && means "and" in Java.

QCC:
- When returning a random integer, the output would sometimes be "3.00000004", why?
- The upFace for the "your" coin would be "null", even though it was defined as "heads" in the default contructor, unless we put upFace = "heads" in the first overloaded constructor.
- After flipping, the wayne coin was returning "tails" even though the bias was set to 1.0 in the default constructor. We fixed this by putting "wayne.reset("heads", 1.0);" in the Driver. Why was there this issue in the first place? Also, if the bias was set to 1.0, why was the yours coin returning "tails"?

Time Spent: 2 hours
**/

import java.util.Random;

public class Coin{

  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;

  public Coin(){
    value = 0.01;
    upFace = "heads";
    name = "penny";
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
    bias = 1.0;
  }

  public Coin (String s){
    name = s;
    upFace = "heads";
  }

  public Coin (String s, String nowFace) {
    name = s;
    upFace = nowFace;
  }

  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }
  public int getTailsCtr() {
    return tailsCtr;
  }


  private double assignValue(String s){
    if (s == "penny"){
      value = 0.01;
    } else if (s == "nickel"){
    value = 0.05;
    } else if (s == "dime") {
    value = 0.1;
    } else if (s == "quarter") {
    value = 0.25;
    } else if (s == "half dollar") {
    value = 0.5;
    } else if (s == "dollar") {
    value = 1.0;
    } else {
    System.out.println("Incorrect coin type.");
    }
    return value;
    }

  public void reset (String s, double d) {
    if ((s != "heads") && (s != "tails")) {
      System.out.println("Incorrect face type.");
    }
    else {
      upFace = s;
    }
    if ((d < 0.0) || (d > 1.0)) {
      System.out.println("Bias value out of range.");
    }
    else {
      bias = d;
    }

  }

  public String flip() {
    flipCtr += 1;

    if (bias == 1.0) {
      upFace = "heads";
      headsCtr += 1;
    }
    else if (bias == 0.0) {
      upFace = "tails";
      tailsCtr += 1;
    }
    else {
      Random rand = new Random();
      int num = rand.nextInt(10);
      double test = 0.1 * num;
      if (test < bias) {
        upFace = "tails";
        tailsCtr += 1;
      }
      else {
        upFace = "heads";
        headsCtr += 1;
      }
    }
    return upFace;
  }

  public boolean equals(Coin other) {
    if (upFace == other.upFace) {
      return true;
    }
    else {
      return false;
    }
  }

  public String toString() {
    String output = name + " -- " + upFace;
    return output;
  }

}
