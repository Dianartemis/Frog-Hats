public class sum28 {

  public static void main( String[] args ) {
    System.out.println(sum28(new int[] {2, 3, 2, 2, 4, 2}));
    System.out.println(sum28(new int[] {2, 3, 2, 2, 4, 2, 2}));
    System.out.println(sum28(new int[] {1, 2, 3, 4}));
  }

  public static boolean sum28(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 2) {
        sum+=2;
      }
    }
    if (sum == 8) {
      return true;
    }
    return false;
  }

}
