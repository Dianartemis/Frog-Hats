/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// Team Orange Marshmallows: Julia Kozak, Nina Jiang, Diana Akhmedova
// APCS pd08
// HW40 -- 2D arrays
// 2021-11-29
// Time Spent: 0.5 hours

/**
DISCO:
- int[a][b] means that you have an integer array within an array, with a rows and b columns.
- Each array term doesn't necessarily need to have the same number of ints.
QCC:
- What is the main use of 2D arrays, as compared to regular arrays?
- Can you have arrays within arrays infinitely?
**/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    for (int i = 0; i < a.length; i++) {
      String ret = "{";
      for (int j = 0; j < a[i].length-1; j++) {
        ret += a[i][j] + ", ";
      }
      ret += a[i][a[i].length-1] + "}";
      System.out.println(ret);
    }
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for (int[] b : a) {
      String ret = "{";
      for (int c : b) {
        ret += c + ", ";
      }
      ret = ret.substring(0, ret.length() - 2);
      ret += "}";
      System.out.println(ret);
    }
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        sum += a[i][j];
      }
    }
    return sum;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    int sum = 0;
    for (int i = 0; i < m.length; i++) {
      sum += sumRow(i, m);
    }
    return sum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int sum = 0;
    for (int i = 0; i < a[r].length; i++) {
      sum += a[r][i];
    }
    return sum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    int summer = 0;
    for (int a : m[r]) {
      summer += a;
    }
    return summer;
  }


  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
