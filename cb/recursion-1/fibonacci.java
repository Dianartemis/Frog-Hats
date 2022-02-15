public class fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacci(0));
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(2));
  }

  public static int fibonacci(int n) {
    if (n == 0) {
      return n;
    }
    else if (n == 1) {
      return n;
    }
    else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
