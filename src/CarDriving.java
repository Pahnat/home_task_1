public class CarDriving {

    public static void getDays(int distance, int speed){
        int days = distance / speed + (((speed - 1) + (distance % speed)) / speed);
        System.out.println(days);

    }

}
