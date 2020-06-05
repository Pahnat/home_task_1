public class TimeDifference {

    private static int hours;
    private static int hours2;
    private static int minutes;
    private static int minutes2;
    private static int seconds;
    private static int seconds2;

    public static void main(String[] args) {

        hours = 1;
        minutes = 1;
        seconds = 1;
        hours2 = 2;
        minutes2 = 2;
        seconds2 = 2;

        getDifference();

        hours = 1;
        minutes = 2;
        seconds = 30;
        hours2 = 1;
        minutes2 = 3;
        seconds2 = 20;

        getDifference();

    }

    private static void getDifference(){
        int secondSum = hours * 3600 + minutes * 60 + seconds;
        int secondSum2 = hours2 * 3600 + minutes2 * 60 + seconds2;

        System.out.println(secondSum2 - secondSum);
    }
}
