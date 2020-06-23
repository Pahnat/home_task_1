public class IntSwapper {

    public static void intSwap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }

}
