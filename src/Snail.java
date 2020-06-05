public class Snail {

    private static int h;
    private static int a;
    private static int b;

    public static void main(String[] args) {

        h = 10;
        a = 3;
        b = 2;

        riseUp();

        h = 20;
        a = 7;
        b = 3;

        riseUp();

    }

    private static void riseUp() {
        int days = ((h - a) / (a - b)) + (((a - 1) + (h - a) % (a - b)) / a) + 1;
        System.out.println(days);
    }

}
