/**
CATVLLVS VIII x II | Faiza Huda, Diana Akhmedova, Truthful Tom, Ajax, Huebert
APCS pd8
HW64 -- Revistitation
time spent: 1 hr
**/

public class bunnyEars2 {
  public static void main(String[] args) {
    System.out.println(bunnyEars2(0));
    System.out.println(bunnyEars2(1));
    System.out.println(bunnyEars2(2));
  }

  public static int bunnyEars2(int bunnies) {
    if (bunnies == 0) {
      return bunnies;
    }
    else if (bunnies % 2 == 0) {
      return bunnyEars2(bunnies - 1) + 3;
    }
    else {
      return bunnyEars2(bunnies - 1) + 2;
    }
  }
}
