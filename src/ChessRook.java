public class ChessRook {

    private static int x1;
    private static int y1;
    private static int x2;
    private static int y2;

    public static void main(String[] args) {

        x1 = 1;
        y1 = 1;
        x2 = 2;
        y2 = 2;
        isBeat();

        x1 = 1;
        y1 = 1;
        x2 = 2;
        y2 = 1;
        isBeat();

    }

    private static void isBeat (){

        if ((x1 == x2) || (y1 == y2)){
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
