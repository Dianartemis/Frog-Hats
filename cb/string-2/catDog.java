public class catDog {

  public static void main( String[]args ) {
    System.out.println( catDog("catdog") );
    System.out.println( catDog("catcat") );
    System.out.println( catDog("1cat1cadodog") );
  }

  public static boolean catDog( String str ) {
    int countCat = 0;
    int countDog = 0;
    for( int i = 0; i < str.length() - 2; i++ ) {
      String sub = str.substring(i, i + 3);
      if (sub.equals("cat")) {
        countCat += 1;
      }
      if (sub.equals("dog")) {
        countDog += 1;
      }
    }
    if (countCat == countDog) {
      return true;
    }
    return false;
  }

}
