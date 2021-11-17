public class reverse3 {

  public static int[] reverse3(int[] nums) {
    int oldNum1 = nums[0];
    int oldNum3 = nums[2];
    for(int i = 0; i < nums.length; i++) {
      nums[0] = oldNum3;
      nums[2] = oldNum1;
    }
    return nums;
  }

  public static String arrToString( int[] ary ) {
    String ans = "[";
    for( int i = 0; i < ary.length; i++ ) {
      ans += ary[i];
      if( i != ary.length - 1 ) {
        ans += ", ";
      }
    }
    return ans + "]";
  }

  public static void main(String[] args) {
    System.out.println(arrToString(reverse3(new int[] {1, 2, 3})));
    System.out.println(arrToString(reverse3(new int[] {5, 11, 9})));
    System.out.println(arrToString(reverse3(new int[] {7, 0, 0})));
  }
}
