import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Arrays1{

    //exercise 1.1, chapter 8
    public static double[] powArray(double a[]) {
      for (int i = 0; i < a.length; i++) {
        a[i] = Math.pow(a[i], 2.0);
      }
      return a;
    }

    //exercise 1.2
    public static int[] histogram(int n) {
      Random random = new Random();
      int[] array = new int[n];
      int min = 1;
      int max = 99;
      for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100);
      }
      return array;
    }

    //exercise 4
    public static int indexOfMax(int array[]) {
    int largest = array[0];
    int largestIndex = 0;

    for(int i = 0; i < array.length; i++) {
        if(array[i] > largest) {
            largest = array[i];
            largestIndex = i;
        }
    }
    return largestIndex;
  }

    //exercise 5
    public static void sieve(String[] args) throws java.lang.Exception {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      boolean[] v = new boolean[1000000];
      int[] primes = new int[1000000];

      int counter = 0;
      for(int i=2;i<=(int)Math.sqrt(m);i++) {
        v[i]=true;
      }
      for(int i=2;i<=(int)Math.sqrt(m);i++) {
        if(v[i])
      {
        primes[counter++]=i;
        for(int j=i*i;j<=(int)Math.sqrt(m);j+=i) {
          v[j]=false;
        }
      }
    }
    boolean[] flags = new boolean[1000000];
    for(int i=n;i<m;i++) {
      flags[i]=true;
    }
    for(int i=0;i<counter;i++) {
      int start = n + (-n % primes[i]);
      for(int j=start;j<m;j+=primes[i])
      if (j != primes[i])
      flags[j]=false;
    }
    for(int i=n;i<m;i++)
    if(flags[i])
    System.out.println(i);
    in.close();
  }


    public static void main(String[] args) {
        double[] a = new double[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(powArray(a)));
        System.out.println(" ");
        System.out.println(" ");

        System.out.println(Arrays.toString(histogram(100)));
        System.out.println(" ");

        int[] histArray = {3,7,2,12,7,6,15,9,5};
        System.out.println(indexOfMax(histArray));
        System.out.println(" ");

        //System.out.println(sieve());
    }
  }
