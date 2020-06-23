public class TimeDifference {

    public static void getDifference(int hours, int minutes, int seconds, int hours2, int minutes2, int seconds2) {
        int secondSum = hours * 3600 + minutes * 60 + seconds;
        int secondSum2 = hours2 * 3600 + minutes2 * 60 + seconds2;

        System.out.println(secondSum2 - secondSum);
    }
}
