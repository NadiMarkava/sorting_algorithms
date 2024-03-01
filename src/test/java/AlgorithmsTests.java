import org.testng.annotations.Test;

public class AlgorithmsTests {

    @Test
    public static void insertionSort() {
        int[] arr = {13, 7, 25, 19, 2, 43};
        Algorithms alg = new Algorithms();
        alg.insertionSort(arr);
    }

    @Test
    public static void bubbleSorting() {
        int[] arr = {13, 7, 25, 19, 2, 43};
        Algorithms alg = new Algorithms();
        alg.bubbleSort(arr);
    }

    @Test
    public static void checkNumberIsEvenOdd() {
        int[] arr = {12, 6, 4, 1, 15, 10};
        Algorithms alg = new Algorithms();
        alg.checkNumberIsEvenOrOdd(arr);
    }

    @Test
    public static void averageOfInteger() {
        int[] arr = {12, 6, 4, 1, 15, 10};
        Algorithms alg = new Algorithms();
        alg.findAverage(arr);
    }

    @Test
    public static void reverseInteger() {
        int number = 58395421;
        Algorithms alg = new Algorithms();
        alg.reverseNumber(number);
    }
}
