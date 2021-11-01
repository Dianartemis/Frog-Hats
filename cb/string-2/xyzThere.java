public class xyzThere {

  public static void main ( String[] args ) {
    System.out.println( xyzThere("abcxyz"));
    System.out.println( xyzThere("abc.xyz"));
    System.out.println( xyzThere("xyz.abc"));
  }

  public static boolean xyzThere (String str) {
    for( int i = 0; i < str.length() - 2; i++ ) {
      String sub = str.substring(i, i + 3);
      if (i == 0 && sub.equals("xyz")) {
        return true;
      }
      else if (sub.equals("xyz") && !str.substring(i - 1, i).equals(".")) {
        return true;
      }
    }
    return false;
  }
}
