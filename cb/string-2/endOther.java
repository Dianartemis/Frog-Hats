public class endOther {

  public static void main( String[]args ) {
    System.out.println( endOther("Hiabc", "abc") );
    System.out.println( endOther("AbC", "HiaBc") );
    System.out.println( endOther("abc", "abXabc") );
  }

  public static boolean endOther( String a, String b ) {
    int aLength = a.length();
    int bLength = b.length();
    if (aLength > bLength && a.substring(aLength - bLength).toLowerCase().equals(b.toLowerCase())) {
      return true;
    }
    else if (bLength > aLength && b.substring(bLength - aLength).toLowerCase().equals(a.toLowerCase())) {
      return true;
    }
    else if (a.equals(b)) {
      return true;
    }
    return false;
  }

}
