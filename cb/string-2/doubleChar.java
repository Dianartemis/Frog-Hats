public class doubleChar {
  public static void main ( String[] args ) {
    System.out.println( doubleChar("The") );
    System.out.println( doubleChar("AAbb") );
    System.out.println( doubleChar("Hi-There") );
  }

  public static String doubleChar (String str) {
    String ret = "";
    for (int i = 0; i < str.length(); i++) {
      ret += str.substring(i, i + 1);
      ret += str.substring(i, i + 1);
    }
    return ret;
  }
}
