/*
Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
APCS pd08
HW73 - QuickSort Implementation
2022-03-09w
time spent : 0.8 hrs
*/

public class QuickSelect
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  /**
   * int partition(int[],int,int,int)
   * DESCRIPTION
   * Array is partitioned into two subarrays with a split(element of index splitter).
   * Elements to the left of split is less than split.
   * Elements to the right of split is greater than split.
   * Split is adjusted to where it should be.
   *
   *
   * @param arr
   * @param a -- lo -- The beginning index we use for partitioning
   * @param b -- hi -- The end index we use for partitioning
   * @param c -- splitter -- The index of element that we compare the rest of the elements of the list to.
   * @return int
   *
   */
  public static int partition( int[] arr, int lo, int hi, int splitter)
  {
    int split = arr[splitter];

    swap(splitter, hi, arr); // split is moved to the end

    int s = lo;

    for (int i = lo; i < hi; i++){
      if (arr[i] < split){ // compares elements of the list to split
        swap(s, i, arr);
        s += 1;
      }
    }

    swap(hi, s, arr); // split put back into place

    return s; // returns # of elements before splitIndex
  }//end partition

  public static int quickSelect(int[] arr, int lo, int hi, int y) {
    if (lo == arr.length - 2) {
      lo = hi;
    }

    int splitterIndex = partition(arr, lo, hi, (lo + hi) / 2 );

    if (splitterIndex == y - 1) {
      return arr[splitterIndex];
    }
    else if (splitterIndex > y - 1) {
      return quickSelect(arr, lo, splitterIndex, y);
    } else {
      return quickSelect(arr, splitterIndex, hi, y);
    }

  }


  //main method for testing
  public static void main( String[] args )
  {

    //init test arrays of magic numbers
    int[] arr1 = {3,2,1,4,5};
    int[] arr3 = {33,28,1,4982,37};
    int[] arr4 = {1,2,3,4};
    int[] arr5 = {5,4,3,2,1};

    // Best Case Scenario
    // Splitter is on the target
    System.out.println(quickSelect(arr3, 0, 4, 1)); // smallest element in arr3
    System.out.println(quickSelect(arr1, 0, 4, 1)); // smallest element in arr1

    // Worst Case Scenario
    // Splitter is on opposite ends with the target
    System.out.println(quickSelect(arr5, 0, 4, 1)); // smallest element in arr5
    System.out.println(quickSelect(arr5, 0, 4, 5)); // largest element in arr5

    // Testing Even Arrays
    System.out.println(quickSelect(arr4, 0, 3, 1)); // smallest element in arr5


  }//end main

}//end class Mysterion
