/**
CATVLLVS VIII x II | Faiza Huda, Diana Akhmedova, Truthful Tom, Ajax, Huebert
APCS pd8
HW64 -- Revistitation
time spent: 1 hr
**/

public class sumDigits {
  public static void main(String[] args) {
    System.out.println(sumDigits(126));
    System.out.println(sumDigits(49));
    System.out.println(sumDigits(12));
  }

  public static int sumDigits(int n) {
    if (n < 10) {
      return n;
    }
    else {
      return sumDigits(n / 10) + n % 10;
    }
  }
}
