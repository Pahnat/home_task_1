public class Main {

    public static void main(String[] args) {

        System.out.println("Task1 (Обмен значений)");
        IntSwapper.intSwap(5, 10);
        IntSwapper.intSwap(55, 11);
        System.out.println();

        System.out.println("Task2 (Конец уроков)");
        Lessons.getTime(2);
        Lessons.getTime(3);
        System.out.println();

        System.out.println("Task3 (Разность времен)");
        TimeDifference.getDifference(1, 1, 1, 2, 2, 2);
        TimeDifference.getDifference(1, 2, 30, 1, 3, 20);
        System.out.println();

        System.out.println("Task4 (Автопробег)");
        CarDriving.getDays(400, 100);
        CarDriving.getDays(401, 100);
        CarDriving.getDays(499, 100);
        CarDriving.getDays(500, 100);
        CarDriving.getDays(501, 100);
        System.out.println();

        System.out.println("Task5 (Улитка)");
        Snail.riseUp(10, 3, 2);
        Snail.riseUp(20, 7, 3);
        System.out.println();

        System.out.println("Task6 (Максимум)");
        FindMax.findMaxValue(43, 7);
        FindMax.findMaxValue(20, 19);
        System.out.println();

        System.out.println("Task7 (Ладья)");
        ChessRook.isBeat(1, 1, 2, 2);
        ChessRook.isBeat(1, 1, 2, 1);
        System.out.println();

        System.out.println("Task8 (Количество равных из трех)");
        ThreeNumbers.countOfEquals("3", "1", "0");
        ThreeNumbers.countOfEquals("0", "3", "0");
        ThreeNumbers.countOfEquals("3", "3", "3");
        System.out.println();

        System.out.println(("Task9 (Количество элементов, больших предыдущего)"));
        BiggerThanPrevious.countBiggerNumbers(6, 0, 1, 2, 3, 4, 5);
        BiggerThanPrevious.countBiggerNumbers(7, 6, 5, 4, 3, 2, 1, 0);
        BiggerThanPrevious.countBiggerNumbers(4, 3, 1, 7, 5);
        System.out.println();

        System.out.println("Task10 (Количество элементов больших обоих соседей)");
        BiggerThanNeighbors.countLessNeighbors(6, 0, 1, 2, 3, 4, 5);
        BiggerThanNeighbors.countLessNeighbors(7, 5, 6, 4, 2, 3, 1, 0);
        BiggerThanNeighbors.countLessNeighbors(4, 3, 1, 7, 5);
        System.out.println();

        System.out.println("Task11 (Переставить соседние элементы)");
        SwapNeighbors.swap(6, 0, 1, 2, 3, 4, 5);
        SwapNeighbors.swap(7, 5, 6, 4, 2, 3, 1, 0);
        SwapNeighbors.swap(4, 3, 1, 7, 5);
    }

}
