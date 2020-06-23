public class FindMax {

    public static void findMaxValue(int x, int y) {
        System.out.println((((x + y) / y - 1) * x + ((x + y) / x -1) * y) / (x / y + y / x));
    }

}
