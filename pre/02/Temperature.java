import java.util.Scanner;

public class Temperature{

    //exercise 2, chapter 3
    public static void main(String[] args){
        int C;
        double F;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the temperature in Celsius? ");
        C = in.nextInt();

        F = C * (9 / 5) + 32;
        System.out.print(C + " C = ");
        System.out.println(F + " F");
    }
}
