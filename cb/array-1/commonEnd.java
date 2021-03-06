// Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

public class commonEnd {

  public static boolean common(int[] a, int[] b) {
    if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String [] args) {
    System.out.println(common(new int[] {1, 2, 3}, new int[] {7,3}));
    System.out.println(common(new int[] {1, 2, 3}, new int[] {7,3, 2}));
    System.out.println(common(new int[] {1, 2, 3}, new int[] {1,3}));
  }

}
