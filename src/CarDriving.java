public class CarDriving {

    private static  int speed;

    public static void main(String[] args) {

        speed = 100;

        getDays(400);
        getDays(401);
        getDays(499);
        getDays(500);

    }

    private static void getDays(int i){
        int days = i / speed + (((speed - 1) + (i % speed)) / speed);
        System.out.println(days);

    }
}
