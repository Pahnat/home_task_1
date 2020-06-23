public class BiggerThanPrevious {

    public static void countBiggerNumbers(int arraySize, int... elements) {

        int count = 0;

        for (int i = 0; i < arraySize - 1; i++) {
            if (elements[i] < elements[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }

}
