public class Lessons {

    private static final int MINUTES_IN_HOUR = 60;
    private static final int LESSON_DURATION = 45;
    private static final int SHORT_BREAK = 5;
    private static final int LONG_BREAK = 15;
    private static final int LESSON_START = 9;

    public static void getTime(int lessonNumber) {
        int minutesCount = lessonNumber * LESSON_DURATION + SHORT_BREAK * (lessonNumber / 2) +
                (LONG_BREAK * ((lessonNumber - 1) / 2));

        int hours = LESSON_START + (minutesCount / MINUTES_IN_HOUR);
        int minutes = minutesCount % MINUTES_IN_HOUR;

        System.out.println(hours + ":" + minutes);
    }

}
