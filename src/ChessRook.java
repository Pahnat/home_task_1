public class ChessRook {

    public static void isBeat (int point1X, int point1Y, int point2X, int point2Y){

        if ((point1X == point2X) || (point1Y == point2Y)){
            System.out.println("YES");
        } else
            System.out.println("NO");
    }

}
