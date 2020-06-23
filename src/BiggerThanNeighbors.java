public class BiggerThanNeighbors {

    public static void countLessNeighbors(int arraySize, int... elements) {

        int count = 0;

        for (int i = 1; i < arraySize - 1; i++) {
            if (elements[i] > elements[i + 1] && elements[i] > elements[i - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
