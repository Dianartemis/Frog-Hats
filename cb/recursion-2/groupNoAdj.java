/**
CATVLLVS VIII x II | Faiza Huda, Diana Akhmedova, Truthful Tom, Ajax, Huebert
APCS pd8
HW64 -- Revistitation
time spent: 1 hr
**/

public class groupNoAdj {
  public static void main(String[] args) {
    System.out.println(groupNoAdj(0, new int[] {2, 5, 10, 4}, 12));
    System.out.println(groupNoAdj(0, new int[] {2, 5, 10, 4}, 14));
    System.out.println(groupNoAdj(0, new int[] {2, 5, 10, 4}, 7));
  }

  public static boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) {
      return (target == 0);
    }
    else {
      if (groupNoAdj(start + 2, nums, target - nums[start])) {
        return true;
      }
      if (groupNoAdj(start + 1, nums, target)) {
        return true;
      }
    }
    return false;
  }
}
