/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes pancake = new Latkes(10);
    String ans = "";

    for (String str : s.split("")) {
      pancake.push(str);
    }

    int size = pancake.getStackSize();

    for (int i = 0; i < size; i++) {
      ans += pancake.pop();
    }

    return ans;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    Latkes waffle = new Latkes(10);

    for (String p : s.split("")) {
      if (p.equals("(") || p.equals("[") || p.equals("{")) {
        waffle.push(p);
      }
      else {
        if (p.equals(")")) {
          if (!(waffle.peek().equals("(")))
            return false;
        }
        else if (p.equals("]")) {
          if (!(waffle.peek().equals("[")))
            return false;
        }
        else if (p.equals("]")) {
          if (!(waffle.peek().equals("{")))
            return false;
        }
      }
    }
    return true;
  }


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
