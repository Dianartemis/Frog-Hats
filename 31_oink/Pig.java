public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) {
    if( w != null && letter.length() == 1 ) {
      hasA( "cat", "a" );
      return true;
    }
    else {
      hasA( "cat", "p" );
      return false;
    }
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) {
    if( letter.length() == 1 ) {
      if( letter = "a" || letter = "e" || letter = "i" || letter = "o" || letter = "u" ) {
        return true;
      }
      else {
        return false;
      }
    System.out.println("Not a letter.");
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) {
    if( w != null ) {
      if( isAVowel(w) == true ) {
        return 0;
      else {
        return 0;
      }
    }
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) {
    if( w != null ) {
    }
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) {
    /* YOUR IMPLEMENTATION HERE */
  }


  public static void main( String[] args ) {
    /* YOUR TEST CALLS HERE */
  }//end main()

}//end class Pig
