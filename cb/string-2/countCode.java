public class countCode {

  public static void main( String[] args ) {
    System.out.println( countCode("aaacodebbb") );
    System.out.println( countCode("codexxcode") );
    System.out.println( countCode("cozexxcope") );
  }

  public static int countCode( String str ) {
    int num = 0;
    for( int i = 0; i < str.length() - 3; i++ ) {
      String sub1 = str.substring(i, i + 1);
      String sub2 = str.substring(i + 1, i + 2);
      String sub3 = str.substring(i + 3, i + 4);
      if (sub1.equals("c") && sub2.equals("o") && sub3.equals("e")) {
        num++;
      }
    }
    return num;
  }
}
