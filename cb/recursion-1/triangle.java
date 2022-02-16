/**
CATVLLVS VIII x II | Faiza Huda, Diana Akhmedova, Truthful Tom, Ajax, Huebert
APCS pd8
HW64 -- Revistitation
time spent: 1 hr
**/

public class triangle {
  public static void main(String[] args) {
    System.out.println(triangle(0));
    System.out.println(triangle(1));
    System.out.println(triangle(2));
  }

  public static int triangle(int rows) {
    if (rows == 0) {
      return rows;
    }
    else {
      return triangle(rows - 1) + rows;
    }
  }
}
