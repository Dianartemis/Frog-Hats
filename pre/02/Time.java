public class Time{

    //exercise 3, chapter 2
    public static void main(String[] args){
        int hour = 14;
        int minute = 17;
        int second = 26;

        int hourNow = 14;
        int minuteNow = 29;
        int secondNow = 57;

        System.out.print("Number of seconds since midnight: ");
        System.out.println((hour * 3600) + (minute * 60) + second);

        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(((24 - hour) * 3600) + ((60 - minute) * 60) + (60 - second));

        System.out.print("Percent of the day that has passed: ");
        System.out.println(((hour * 3600) + (minute * 60) + second) * 100 / 86400);

        System.out.print("Elapsed time since I started working on this exercise: ");
        System.out.print(hourNow - hour);
        System.out.print(" hours, ");
        System.out.print(minuteNow - minute);
        System.out.print(" minutes, ");
        System.out.print(secondNow - second);
        System.out.println(" seconds");
    }
}
