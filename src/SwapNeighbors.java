import java.util.Arrays;

public class SwapNeighbors {

    public static void swap(int arraySize, int... elements) {

        for (int i = 0; i < arraySize - 1; i += 2) {
            int temporary;
            temporary = elements[i];
            elements[i] = elements[i + 1];
            elements[i + 1] = temporary;
        }
        System.out.println(Arrays.toString(elements));
    }

}
