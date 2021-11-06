public class evenOdd {

  public static void main( String[] args ) {
    System.out.println(arrToString(evenOdd(new int[] {1, 0, 1, 0, 0, 1, 1})));
    System.out.println(arrToString(evenOdd(new int[] {3, 3, 2})));
    System.out.println(arrToString(evenOdd(new int[] {2, 2, 2})));
  }

  public static int[] evenOdd(int[] nums) {
    // initialize new array
    int[] newNum = new int[nums.length];

    // initialize front and end indices
    int front = 0;
    int end = nums.length - 1;

    for (int i = 0; i < nums.length; i++){
      // if even, put in front
      if (nums[i] % 2 == 0) {
        newNum[front++] = nums[i];
        //front++;
      }
      // if odd put in end
      else {
        newNum[end--] = nums[i];
      }
    }
    // return new array
    return newNum;
  }

  public static String arrToString(int[] ary) {
    String ans = "[";
    for (int i = 0; i < ary.length; i++) {
      ans += ary[i];
      if (i != ary.length - 1) {
        ans += ", ";
      }
    }
    return ans + "]";
  }

}
