public class Methods{

    //exercise 2, chapter 6
    public static boolean isDivisible(int n, int m) {
      if ((n % m) == 0) {
        return true;
      }
      else {
        return false;
      }
    }

    //exercise 3
    public static boolean isTriangle(int s1, int s2, int s3) {
      if ((s1 > (s2 + s3)) || (s2 > (s1 + s3)) || (s3 > (s1 + s2))) {
        return false;
      }
      else {
        return true;
      }
    }

    //exercise 8
    public static int ack(int m, int n) {
      if (m == 0) {
        return (n + 1);
      }
      else if (n == 0) {
        return ack(m - 1, 1);
      }
      else {
        return ack(m - 1, ack(m, n - 1));
      }
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(6,3));
        System.out.println(isDivisible(7,2));
        System.out.println(" ");
        System.out.println(isTriangle(3,4,5));
        System.out.println(isTriangle(1,2,12));
        System.out.println(" ");
        System.out.println(ack(0,3));
        System.out.println(ack(2,0));
        System.out.println(ack(2,3));
    }
}
