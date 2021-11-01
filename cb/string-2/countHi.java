public class countHi {

  public static void main( String[]args ) {
    System.out.println( countHi("abc hi ho") );
    System.out.println( countHi("ABChi hi") );
    System.out.println( countHi("hihi") );
  }

  public static int countHi( String str ) {
    int num = 0;
    for( int i = 0; i < str.length() - 1; i++ ) {
      String sub = str.substring(i, i + 2);
      if (sub.equals("hi")) {
        num++;
      }
    }
    return num;
  }

}
