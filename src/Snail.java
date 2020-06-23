public class Snail {

    public static void riseUp(int height, int speed, int rollback) {
        System.out.println(((height - speed) / (speed - rollback)) + (((speed - 1) +
                (height - speed) % (speed - rollback)) / speed) + 1);
    }

}
