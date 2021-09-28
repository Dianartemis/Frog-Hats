public class Loops{

    //exercise 3, chapter 7
    public static double power(double x, int n) {
      int i = 0;
      double xToPowerN = 1.0;
      while (i < Math.abs(n)) {
        if (n > 0) {
          xToPowerN = xToPowerN * x;
        }
        else {
          xToPowerN = xToPowerN / x;
        }
        i = i + 1;
      }
      return xToPowerN;
    }

    //exercise 4
    public static int factorial(int fact) {
      int result = 1;
      while (fact > 0) {
        result = result * fact;
        fact = fact - 1;
      }
      return result;
    }

    //exercise 5
    public static double myexp(double x, int n) {
      double end = 1.0;
      double term = 1.0;
      int a = 1;
      while (a <= n) {
        term = term * x / a;
        end = end + term;
        a = a + 1;
      }
      return end;
    }

    public static void check(double x) {
      System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x, 17));
    }

    public static void main(String[] args) {
        System.out.println(power(9.0,3));
        System.out.println(" ");
        System.out.println(factorial(5));
        System.out.println(" ");
        double x = 0.1;
        while (x <= 100.0) {
          check(x);
          x = x * 10;
        }
        x = -0.1;
        while (x >= -100.0) {
          check(x);
          x = x * 10;
        }
    }
}
