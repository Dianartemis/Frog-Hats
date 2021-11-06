public class evenOdd {

  public static void main( String[] args ) {
    System.out.println(evenOdd([1, 0, 1, 0, 0, 1, 1]));
    System.out.println(evenOdd([3, 3, 2]));
    System.out.println(evenOdd([2, 2, 2]));
  }

  public int[] evenOdd(int[] nums) {
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
}
