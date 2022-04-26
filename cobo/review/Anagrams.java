import java.util.*;

public class Anagrams {

  private static final String SPACE = " ";

  public static void main(String[] args) {
    System.out.println(isAnagram("palm", "lamp"));
    System.out.println(isAnagram("llamp", "lamp"));
    System.out.println(isAnagram("llama", "lampa"));
    System.out.println(isAnagram("palm al", "lamp la"));
    System.out.println(isAnagram("StOp", "PoTs"));
  }

  public static boolean isAnagram(String s1, String s2) {
    String str1 = s1.replaceAll(" ", "").toLowerCase();
    String str2 = s2.replaceAll(" ", "").toLowerCase();

    boolean match = false;

    if (str1.length() == str2.length()) {
      for (int i = 0; i < str1.length(); i++) {
        for (int j = 0; j < str2.length(); j++) {
          if (str1.charAt(i) == str2.charAt(j)) {
            str2 = str2.substring(0, j) + str2.substring(j + 1);
            break;
          }
        }
      }
      if (str2.length() == 0) {
        return true;
      }
      else {
        return false;
      }
    }
    return false;
  }

}
