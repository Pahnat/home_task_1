public class ThreeNumbers {

    public static void countOfEquals(String num1, String num2, String num3) {

        if (num1.equals(num2) && num1.equals(num3)) {
            System.out.println(3);
        } else if (num1.equals(num2) || num2.equals(num3) || num1.equals(num3)) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }

}
