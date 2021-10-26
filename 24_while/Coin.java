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
    reset("heads", 0.5);
  }

  public Coin (String s){
    this();
    name = s;
    assignValue(s);
  }

  public Coin (String s, String nowFace) {
    this(s);
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


  private double assignValue(String s) {
    if (name.equals("penny")) {
      value = 0.01;
    } else if (name.equals("nickel")) {
    value = 0.05;
    } else if (name.equals("dime")) {
    value = 0.1;
    } else if (name.equals("quarter")) {
    value = 0.25;
    } else if (name.equals("half dollar")) {
    value = 0.5;
    } else if (name.equals("dollar")) {
    value = 1.0;
    } else {
    System.out.println("Incorrect coin type.");
    }
    return value;
    }

  public void reset (String s, double d) {
    flipCtr = 0;
    tailsCtr = 0;
    headsCtr = 0;
    upFace = s;
    bias = d;
  }

  public String flip() {
    flipCtr += 1;

    double test = Math.random();
    if (test < bias) {
      upFace = "heads";
      headsCtr += 1;
    }
    else {
      upFace = "tails";
      tailsCtr += 1;
    }
    return upFace;
  }

  public boolean equals(Coin other) {
    return upFace.equals(other.upFace);
  }

  public String toString() {
    String output = " " + name + " -- " + upFace;
    return output;
  }

}
